package com.springbootApi.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbootApi.model.request.DetailUser;
import com.springbootApi.model.response.AccountAuth;
import com.springbootApi.uitils.Constant;
import com.springbootApi.uitils.Global;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.jwt.Jwt;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Component
@RequiredArgsConstructor
public class AuthenticationFilter extends OncePerRequestFilter {
    private final AuthenticationDecoder authenticationDecoder;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        final var header = request.getHeader(Constant.X_USER);
//        if (header == null) {
//            filterChain.doFilter(request, response);
//            return;
//        }
        String token = getJWTToken(request);
        var authentication = authenticationDecoder.decode(token);
        if (authentication != null){
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
        filterChain.doFilter(request, response);
    }

    /**
     * @param request
     * @return
     */
    protected String getJWTToken(HttpServletRequest request) {
        String authorizationVal = request.getHeader(HttpHeaders.AUTHORIZATION);
        if (authorizationVal == null
            || authorizationVal.length() <= Global.BEARER.length() + 1
            || !authorizationVal.startsWith(Global.BEARER))
            return "";

        return authorizationVal.substring(Global.BEARER.length() + 1);
    }
}
