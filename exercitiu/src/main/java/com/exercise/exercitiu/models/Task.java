package com.exercise.exercitiu.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tasktable")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String title;

    String description;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "taskList")
    TaskList taskList;
}
