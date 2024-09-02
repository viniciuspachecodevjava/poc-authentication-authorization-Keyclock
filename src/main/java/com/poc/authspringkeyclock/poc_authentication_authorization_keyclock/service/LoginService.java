package com.poc.authspringkeyclock.poc_authentication_authorization_keyclock.service;

import com.poc.authspringkeyclock.poc_authentication_authorization_keyclock.domain.User;
import org.springframework.http.ResponseEntity;

public interface LoginService {
    ResponseEntity<String> execute(final User user);
}
