package com.exercise.exercitiu.controllers;

import com.exercise.exercitiu.models.Users;
import com.exercise.exercitiu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/users")
    public List<Users> getUsers()
    {
        return this.usersService.getUsers();
    }

    @PostMapping("/addUser")
    public Users AddUser(){
        Users u = new Users();
        u.setUsername("Marcel");
        usersService.addUser(u);
        return u;
    }
}
