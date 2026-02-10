package com.hartford.OTO.controller;

import com.hartford.OTO.entity.User;
import com.hartford.OTO.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }


}
