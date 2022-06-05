package com.springbootApi.controller;

import com.springbootApi.model.response.Response;
import com.springbootApi.model.response.UserResponse;
import com.springbootApi.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customers")
@Validated
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping
    public Response<String> test(){
        return Response.ofSucceeded("hello");
    }

    @GetMapping("/test/{user-id}")
    public Response<UserResponse> check(@PathVariable("user-id") String userId){
        return Response.ofSucceeded(helloService.getUser(userId));
    }

    @GetMapping("/test/hi/he")
    public Response<String> checko(){
        return Response.ofSucceeded("hi he!");
    }
}
