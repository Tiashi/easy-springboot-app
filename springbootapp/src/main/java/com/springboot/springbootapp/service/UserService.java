package com.springboot.springbootapp.service;

import com.springboot.springbootapp.model.User;

public interface UserService {

    User getUser(String id);
    void saveUser(User user);
    void deleteUser(User user);

}
