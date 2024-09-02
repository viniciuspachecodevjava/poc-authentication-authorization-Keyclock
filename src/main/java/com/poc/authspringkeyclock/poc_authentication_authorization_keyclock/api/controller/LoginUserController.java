package com.poc.authspringkeyclock.poc_authentication_authorization_keyclock.api.controller;

import com.poc.authspringkeyclock.poc_authentication_authorization_keyclock.api.request.UserRequest;
import com.poc.authspringkeyclock.poc_authentication_authorization_keyclock.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginUserController {

    private final LoginService loginService;

    public LoginUserController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> execute(@RequestBody final UserRequest userRequest){
        return loginService.execute(userRequest.toDomain(userRequest));
    }
}
