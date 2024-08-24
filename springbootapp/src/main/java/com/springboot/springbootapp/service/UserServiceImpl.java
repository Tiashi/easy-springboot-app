package com.springboot.springbootapp.service;

import com.springboot.springbootapp.exception.NotFoundException;
import com.springboot.springbootapp.model.User;
import com.springboot.springbootapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User getUser(String id) {
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException("No users found from this id."));
    }
    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
