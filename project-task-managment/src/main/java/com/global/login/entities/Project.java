package com.global.login.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "project")
public class Project extends Auditing{

    @Column(name = "Title")
    private String Title;

    @Column(name = "Description")
    private String Description;

    @Lob
    @Column(name = "image")
    private String image;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,mappedBy = "project")
    private List<Task> tasks = new ArrayList<>();


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

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Project(String title, String description, String image, List<Task> tasks) {
        Title = title;
        Description = description;
        this.image = image;
        this.tasks = tasks;
    }

    public Project(Date created_at, Date update_at, String title, String description, String image, List<Task> tasks) {
        super(created_at, update_at);
        Title = title;
        Description = description;
        this.image = image;
        this.tasks = tasks;
    }

    public Project() {
    }

    public Project(Date created_at, Date update_at) {
        super(created_at, update_at);
    }

    @Override
    public String toString() {
        return "Project{" +
                "Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                ", image='" + image + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
