package com.et.EnabledAfricaPlatform.repository.auth;

import com.et.EnabledAfricaPlatform.models.auth.UserLoginState;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLoginStateRepository extends JpaRepository<UserLoginState, Long> {
    Optional<UserLoginState> findByEmail(String email);
}

