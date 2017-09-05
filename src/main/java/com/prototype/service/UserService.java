package com.prototype.service;

import com.prototype.model.User;

public interface UserService {

    User findByUsername(String username);

    User findByEmail(String email);

    User saveUser(User user);

}
