package com.cognizant.oauth2_login_client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	  http
          .authorizeHttpRequests(authorize -> authorize
              .requestMatchers("/public/**").permitAll()
              .anyRequest().authenticated()
          )
          .oauth2Login(Customizer.withDefaults());
        return http.build();
    }
}
