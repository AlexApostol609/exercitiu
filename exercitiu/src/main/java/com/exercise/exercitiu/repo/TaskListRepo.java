package com.exercise.exercitiu.repo;

import com.exercise.exercitiu.models.TaskList;
import com.exercise.exercitiu.models.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskListRepo extends JpaRepository<TaskList, Integer> {

//    public TaskList findTaskListByUser(Users user);
}
