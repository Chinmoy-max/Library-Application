package com.libraryApp.LibraryApp.controller;

import com.libraryApp.LibraryApp.entity.User;
import com.libraryApp.LibraryApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    /*@GetMapping("/api/users/demo")
    public String home(){
        return "demo";
    }*/

    @GetMapping
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.save(user);
    }
}


