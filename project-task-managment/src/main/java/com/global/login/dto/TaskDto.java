package com.global.login.dto;

public class TaskDto {
    private String Name;
    private Boolean Status;

    private ProjectTashDto projectTaskDto;

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

    public ProjectTashDto getProjectTaskDto() {
        return projectTaskDto;
    }

    public void setProjectTaskDto(ProjectTashDto projectTaskDto) {
        this.projectTaskDto = projectTaskDto;
    }

    public TaskDto(String name, Boolean status, ProjectTashDto projectTaskDto) {
        Name = name;
        Status = status;
        this.projectTaskDto = projectTaskDto;
    }

    public TaskDto() {
    }
}