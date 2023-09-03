package com.global.login.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Task")
public class Task extends Auditing{

    @Column(name = "Name",nullable = false)
    private String Name;

    @Column(name = "Status",nullable = false)
    private Boolean Status;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private Project project;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Task(String name, Boolean status, Project project) {
        Name = name;
        Status = status;
        this.project = project;
    }

    public Task(Date created_at, Date update_at, String name, Boolean status, Project project) {
        super(created_at, update_at);
        Name = name;
        Status = status;
        this.project = project;
    }

    public Task() {
    }

    public Task(Date created_at, Date update_at) {
        super(created_at, update_at);
    }

    @Override
    public String toString() {
        return "Task{" +
                "Name='" + Name + '\'' +
                ", Status=" + Status +
                ", project=" + project +
                '}';
    }
}
