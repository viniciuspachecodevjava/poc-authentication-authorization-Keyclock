package com.poc.authspringkeyclock.poc_authentication_authorization_keyclock.api.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public String list(){
        return "Acessando a lista";
    }

    @PostMapping("/")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public String create(){
        return "Criando novas listas";
    }
}
