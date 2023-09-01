package com.exercise.exercitiu.repo;

import com.exercise.exercitiu.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Integer> {
}
