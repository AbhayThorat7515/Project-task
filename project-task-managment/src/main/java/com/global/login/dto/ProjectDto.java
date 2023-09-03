package com.global.login.dto;


import javax.validation.constraints.NotBlank;

public class ProjectDto {
    @NotBlank(message = "Title is mandatory")
    private String Title;

    @NotBlank(message = "Description is mandatory")
    private String Description;
    @NotBlank(message = "image is mandatory")
    private String image;

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

    public ProjectDto(String title, String description, String image) {
        Title = title;
        Description = description;
        this.image = image;
    }

    public ProjectDto() {
    }

}
