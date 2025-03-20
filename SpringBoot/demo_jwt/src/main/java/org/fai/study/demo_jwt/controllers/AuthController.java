package org.fai.study.demo_jwt.controllers;

import org.fai.study.demo_jwt.TokenService;
import org.fai.study.demo_jwt.payloads.UserLogin;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;
    public AuthController(TokenService tokenService, AuthenticationManager authenticationManager) {
        this.tokenService = tokenService;
        this.authenticationManager = authenticationManager;
    }
    @PostMapping("/token")
    public String Login(@RequestBody UserLogin user) {
        System.out.println("Username: " + user.getUsername());
        try {
            var authToken = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());
            System.out.println("Attempting authentication...");
            var authentication = authenticationManager.authenticate(authToken);
            System.out.println("Authentication successful: " + authentication.isAuthenticated());
            String token = tokenService.generateToken(authentication);
            System.out.println("Token generated: " + token);
            return token;
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            throw e;
        }
    }
}
