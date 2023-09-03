package com.global.login.dao;

import com.global.login.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task ,String> {


    Optional<Task> findById(Long i);
}
