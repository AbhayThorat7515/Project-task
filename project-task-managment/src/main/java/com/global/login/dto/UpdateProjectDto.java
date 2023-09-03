package com.global.login.dto;

public class UpdateProjectDto {

    private Long id;
    private String Title;
    private String Description;
    private String image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public UpdateProjectDto(Long id, String title, String description, String image) {
        this.id = id;
        Title = title;
        Description = description;
        this.image = image;
    }

    public UpdateProjectDto() {
    }

}