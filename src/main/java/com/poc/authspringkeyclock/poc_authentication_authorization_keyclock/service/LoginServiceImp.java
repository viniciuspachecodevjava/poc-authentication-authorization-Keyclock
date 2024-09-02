package com.poc.authspringkeyclock.poc_authentication_authorization_keyclock.service;

import com.poc.authspringkeyclock.poc_authentication_authorization_keyclock.domain.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class LoginServiceImp implements LoginService {
    @Override
    public ResponseEntity<String> execute(final User user) {
        HttpHeaders httpHeaders = new HttpHeaders();
        RestTemplate restTemplate = new RestTemplate();
        httpHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("client_id", user.getClientId());
        formData.add("username", user.getLogin());
        formData.add("password", user.getPassword());
        formData.add("grant_type", user.getGrantType());

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<MultiValueMap<String, String>>(formData, httpHeaders);

        var result = restTemplate.postForEntity("http://localhost:8080/realms/keyclockUser/protocol/openid-connect/token", entity, String.class);
        return result;
    }
}
