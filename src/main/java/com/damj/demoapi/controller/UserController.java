package com.damj.demoapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damj.demoapi.model.users;
import com.damj.demoapi.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
   
   
    @GetMapping ("/id")
    public String getAllUsersId() {
        return "respuesta user especifico";
    }

    @GetMapping
    public List<users> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public users createUser(@RequestBody users user) {
        return userService.createUser(user);
    }
}

