package com.virus.springboot.cruddemo.entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
public class Task {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   @Column(name = "title")
    private String title;

   @Column(name = "descriptions")
    private String description;

   @Column(name = "duedate")
    private String dueDate;

    public Task() {
    }

    public Task(int id, String title, String description, String dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }



}
