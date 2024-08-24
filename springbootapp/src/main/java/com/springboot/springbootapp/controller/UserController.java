package com.springboot.springbootapp.controller;

import com.springboot.springbootapp.model.User;
import com.springboot.springbootapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{id}")
    public void getUser(@PathVariable String id) {
        userService.getUser(id);
    }
    @PostMapping()
    public void addUser(@RequestBody User user) {
        userService.saveUser(user);
    }
    @PutMapping()
    public void modifyUser(@RequestBody User user) {
        userService.saveUser(user);
    }
    @DeleteMapping()
    public void deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
    }
}
