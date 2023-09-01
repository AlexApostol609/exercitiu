package com.exercise.exercitiu.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class TaskList {

    @Id
    @GeneratedValue
    Integer id;

    String name;

    public TaskList(){
        tasks = new ArrayList<Task>();
    }

    @OneToMany(mappedBy = "taskList")
    List<Task> tasks;

    public void addTasks(Task task){
            tasks.add(task);
    }

    @OneToMany(mappedBy = "taskList")
    List<Users> users = new ArrayList<Users>();


    public  void addUsers(Users user){
        users.add(user);
    }
}
