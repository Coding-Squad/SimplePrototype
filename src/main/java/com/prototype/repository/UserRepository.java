package com.prototype.repository;

import com.prototype.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(@Param("email") String email);
    User findByUsername(@Param("username") String username);
}
