package com.techdenovo.RestProject.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    @GetMapping("/")
    public String getUser(){

        return "Get user details..";
    }

    @PostMapping("/createUser")
    public String createUser(){

        return "create user..";
    }

    @PutMapping("/updateUser")
    public String updateUser(){

        return "Update user details..";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){

        return "delete user details..";
    }

}
