package com.parshant.user_service.service;

import com.parshant.user_service.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    User getUserByEmail(String email) throws Exception;
    User getUserById(Long id) throws Exception;
    List<User> getUsers() throws Exception;
}
