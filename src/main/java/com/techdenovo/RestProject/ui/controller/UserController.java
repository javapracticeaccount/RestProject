package com.techdenovo.RestProject.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {


    @GetMapping
    public String getUser(){

        return "Get user details..";
    }

    @PostMapping
    public String createUser(){

        return "create user..";
    }

    @PutMapping
    public String updateUser(){

        return "Update user details..";
    }

    @DeleteMapping
    public String deleteUser(){

        return "delete user details..";
    }

}
