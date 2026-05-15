package com.parshant.user_service.service.impl;

import com.parshant.exception.UserException;
import com.parshant.user_service.model.User;
import com.parshant.user_service.repository.UserRepository;
import com.parshant.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUserByEmail(String email) throws UserException {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UserException("User not found with email: " + email);
        }
        return user;
    }

    @Override
    public User getUserById(Long id) throws UserException {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserException("User not found with id: " + id));
    }

    @Override
    public List<User> getUsers() throws UserException {
        return userRepository.findAll();
    }
}
