package com.exercise.exercitiu.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String username;

    @ManyToOne
    @JoinColumn(name = "taskList")
    TaskList taskList;
}
