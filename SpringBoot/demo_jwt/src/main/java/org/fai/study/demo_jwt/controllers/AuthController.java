package org.fai.study.demo_jwt.controllers;

import org.fai.study.demo_jwt.payloads.UserLogin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {
    @PostMapping("/token")
    public String Login(@RequestBody UserLogin user) {
        System.out.println(user.getUsername());
        return "jwt";
    }
}
