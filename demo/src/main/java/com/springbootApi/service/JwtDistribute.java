//package com.springbootApi.service;
//
//import com.auth0.jwt.interfaces.DecodedJWT;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//public class JwtDistribute {
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    public DecodedJWT authenticate(HttpServletRequest request, HttpServletResponse response) throws IOException {
//
//        JwtService jwtService = getJwtObject(request);
//        if (jwtService == null)
//            return null;
//
//        return jwtService.authenticate(request, response);
//
//    }
//
//}
