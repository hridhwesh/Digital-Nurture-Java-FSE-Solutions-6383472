package com.cognizant.jwt_communication.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 
import com.cognizant.jwt_communication.security.JwtTokenProvider;

@RestController
public class AuthController {
    private static final Logger logger = LoggerFactory.getLogger(AuthController.class); 

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestParam String usn) {
        logger.info("Inside /authenticate controller"); 
        String token = jwtTokenProvider.createToken(usn);
        return Map.of("token", token);
    }
}
