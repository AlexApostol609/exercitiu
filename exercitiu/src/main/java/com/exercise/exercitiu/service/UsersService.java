package com.exercise.exercitiu.service;

import com.exercise.exercitiu.models.Users;
import com.exercise.exercitiu.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepo usersRepo;

    public void addUser(Users users){
        usersRepo.save(users);
    }

    public List<Users> getUsers(){
        return usersRepo.findAll();
    }
}
