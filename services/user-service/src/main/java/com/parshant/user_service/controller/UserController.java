package com.parshant.user_service.controller;

import com.parshant.dto.UserDTO;
import com.parshant.exception.UserException;
import com.parshant.user_service.mapper.UserMapper;
import com.parshant.user_service.model.User;
import com.parshant.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequiredArgsConstructor
public class        UserController {

    private final UserService userService;

    @GetMapping("/api/users/profile")
    public ResponseEntity<UserDTO> getUserProfile(
            @RequestHeader("X-User-Email") String email) throws UserException {
        User user = userService.getUserByEmail(email);
        return ResponseEntity.ok(UserMapper.toDTO(user));
    }

    @GetMapping("/api/users/{userId}")
    public ResponseEntity<UserDTO> getUserById(
            @PathVariable Long userId) throws UserException {
        User user = userService.getUserById(userId);
        return ResponseEntity.ok(UserMapper.toDTO(user));
    }

    @GetMapping("/api/users")
    public ResponseEntity<List<UserDTO>> getUsers() throws UserException {
        List<User> users = userService.getUsers();
        return ResponseEntity.ok(UserMapper.toDTOList(users));
    }
}
