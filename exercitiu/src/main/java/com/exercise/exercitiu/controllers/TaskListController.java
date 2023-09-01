package com.exercise.exercitiu.controllers;

import com.exercise.exercitiu.models.Users;
import com.exercise.exercitiu.service.TaskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskListController {
    @Autowired
    TaskListService taskListService;

    @PostMapping(value = "/addtasklist/{userId}")
    public void createNewTaskList(@PathVariable Integer userId){
        taskListService.createNewTaskList(userId);
    }
}
