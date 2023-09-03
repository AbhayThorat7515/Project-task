package com.global.login.dto;


public class UpdateTaskDto {
    private Long id;
    private String Name;
    private Boolean Status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public UpdateTaskDto(Long id, String name, Boolean status) {
        this.id = id;
        Name = name;
        Status = status;
    }

    public UpdateTaskDto() {
    }

}
