package com.virus.springboot.cruddemo.service;

import com.virus.springboot.cruddemo.dao.ITaskRepository;
//import com.virus.springboot.cruddemo.dao.TaskRepository;
import com.virus.springboot.cruddemo.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceimple implements ITaskService{

    ITaskRepository iTaskRepository;

    @Autowired
    public TaskServiceimple(ITaskRepository taskRepository) {
        this.iTaskRepository = taskRepository;
    }
    @Override
    public List<Task> findAll() {
        return iTaskRepository.findAll();
    }

    @Override
    public void delete(int id) {
        iTaskRepository.delete(id);
    }

    @Override
    public Task findById(int id) {
        return iTaskRepository.findById(id);
    }

    @Override
    public void update(Task task) {
         iTaskRepository.update(task);
    }
}
