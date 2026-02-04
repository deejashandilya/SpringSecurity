package com.springsecurity.dto;



public record AuthResponse(
        String token,
        String type,
        long expiresIn,
        UserResponse user
) {
    public AuthResponse(String token, long expiresIn, UserResponse user) {
        this(token, "Bearer", expiresIn, user);
    }
}