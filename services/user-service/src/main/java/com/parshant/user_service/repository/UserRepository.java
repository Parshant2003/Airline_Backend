package com.parshant.user_service.repository;


import com.parshant.emuns.UserRole;
import com.parshant.user_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    Set<User> findByRole(UserRole role);
}
