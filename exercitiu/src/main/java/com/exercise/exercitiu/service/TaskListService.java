package com.exercise.exercitiu.service;

import com.exercise.exercitiu.models.Task;
import com.exercise.exercitiu.models.TaskList;
import com.exercise.exercitiu.models.Users;
import com.exercise.exercitiu.repo.TaskListRepo;
import com.exercise.exercitiu.repo.TaskRepo;
import com.exercise.exercitiu.repo.UsersRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskListService {
    @Autowired
    TaskListRepo taskListRepo;

    @Autowired
    TaskRepo taskRepo;

    @Autowired
    UsersRepo usersRepo;

    public void createNewTaskList(Integer id){
        Users user = usersRepo.findUserById(id);
        TaskList taskList = new TaskList();
        Task task1 = new Task();
        task1.setTitle("something");
        task1.setDescription("something2");

        taskRepo.save(task1);
        taskList.addTasks(task1);
        taskList.addUsers(user);

        taskListRepo.save(taskList);
    }

}
