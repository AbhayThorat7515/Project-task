package com.global.login.dao;

import com.global.login.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project ,String> {
    Optional<Project> findById(Long i);


}
