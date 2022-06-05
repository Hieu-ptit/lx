package com.springbootApi.configs;

import com.springbootApi.controller.ExceptionController;
import com.springbootApi.security.AuthenticationDecoder;
import com.springbootApi.security.AuthenticationFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final AuthenticationDecoder authenticationDecoder;

    private final AuthenticationFilter authenticationFilter;

    private final ExceptionController exceptionController;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests()
            .antMatchers(HttpMethod.GET, "/customers/test/hi").hasAuthority("ADMIN");
        http.exceptionHandling()
            .accessDeniedHandler((request, response, accessDeniedException) ->
                exceptionController.handleAccessDeniedException(accessDeniedException, request, response))
            .authenticationEntryPoint((request, response, authException) ->
                exceptionController.handleAuthenticationException(authException, request, response));
        http.addFilterBefore(new AuthenticationFilter(authenticationDecoder), UsernamePasswordAuthenticationFilter.class);
    }
}
