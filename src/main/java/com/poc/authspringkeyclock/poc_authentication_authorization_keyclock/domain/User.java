package com.poc.authspringkeyclock.poc_authentication_authorization_keyclock.domain;

public class User {
    private String clientId;
    private String login;
    private String password;
    private String grantType;

    public User(String clientId, String login, String password, String grantType) {
        this.clientId = clientId;
        this.login = login;
        this.password = password;
        this.grantType = grantType;
    }

    public String getClientId() {
        return clientId;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getGrantType() {
        return grantType;
    }
}
