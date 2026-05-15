package com.parshant.user_service.service;


import com.parshant.Response.AuthResponse;
import com.parshant.dto.UserDTO;
import com.parshant.exception.UserException;


public interface AuthService {
    AuthResponse login(String email, String password) throws UserException;
    AuthResponse signup(UserDTO req) throws UserException;
}


