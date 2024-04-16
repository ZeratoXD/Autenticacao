package com.generation.autenticacao.service;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Map;

@Service
public class JwtService {

    public Boolean validateJwt(String jwt) {
        try {
            Map<String, Claim> claims = getClaimsFromToken(jwt);
            return claims.size() == 3; // Se tiver 3 claims, retorna true
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private Map<String, Claim> getClaimsFromToken(String token) {
        DecodedJWT decodedJWT = JWT.decode(token);
        return decodedJWT.getClaims();
    }
}
