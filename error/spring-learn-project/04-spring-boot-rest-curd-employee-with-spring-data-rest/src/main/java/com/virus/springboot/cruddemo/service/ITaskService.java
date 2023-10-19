package com.virus.springboot.cruddemo.service;

import com.virus.springboot.cruddemo.entity.Task;

import java.util.List;

public interface ITaskService {

    public List<Task> findAll();

    public void delete(int id);

    public Task findById(int id);

    public void update(Task task);



}
