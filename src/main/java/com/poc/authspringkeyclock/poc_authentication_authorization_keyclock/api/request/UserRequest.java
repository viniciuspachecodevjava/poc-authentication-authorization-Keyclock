package com.poc.authspringkeyclock.poc_authentication_authorization_keyclock.api.request;

import com.poc.authspringkeyclock.poc_authentication_authorization_keyclock.domain.User;

public record UserRequest (String clientId, String username, String password, String grantType){

    public User toDomain(UserRequest userRequest){
        return new User(userRequest.clientId(), userRequest.username(), userRequest.password(), userRequest.grantType());
    }
}
