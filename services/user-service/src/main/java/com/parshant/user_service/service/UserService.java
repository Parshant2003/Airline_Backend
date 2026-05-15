package com.parshant.user_service.service;

import com.parshant.exception.UserException;
import com.parshant.user_service.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    User getUserByEmail(String email) throws UserException;
    User getUserById(Long id) throws UserException;
    List<User> getUsers() throws UserException;
}
