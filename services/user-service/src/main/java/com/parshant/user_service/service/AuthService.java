package com.parshant.user_service.service;


import com.parshant.Response.AuthResponse;
import com.parshant.dto.UserDTO;


public interface AuthService {
     AuthResponse login(String email, String password) throws Exception;
    AuthResponse signup(UserDTO req) throws Exception;
}

