package com.generation.autenticacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.autenticacao.service.JwtService;

@RestController
public class JwtController {
    
    @Autowired
    private JwtService jwtService;

    @PostMapping("/jwt/validate")
    public Boolean validateJwt(@RequestBody String jwt) {
        return jwtService.validateJwt(jwt);
    }
}
