package com.cognizant.jwtexercise.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtil {

    // Secret key used for signing the JWT
    private static final String SECRET_KEY = "mysecretkeymysecretkeymysecretkey12345";

    /**
     * Generates JWT token for the given username.
     *
     * @param username Authenticated username
     * @return JWT Token
     */
    public static String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY.getBytes())
                .compact();
    }
}