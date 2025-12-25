package com.example.restApi.config;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

@Getter
@Configuration
public class AuthConfig {
    @Value("${jwt.secret}")
    private String token;




    @Bean
    public  AuthenticationManager  authenticationManager(AuthenticationConfiguration  configuration) {
        return   configuration.getAuthenticationManager();
    }

}
