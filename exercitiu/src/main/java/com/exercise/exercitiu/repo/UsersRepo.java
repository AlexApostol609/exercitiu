package com.exercise.exercitiu.repo;

import com.exercise.exercitiu.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {

    Users findUserById(Integer id);
}
