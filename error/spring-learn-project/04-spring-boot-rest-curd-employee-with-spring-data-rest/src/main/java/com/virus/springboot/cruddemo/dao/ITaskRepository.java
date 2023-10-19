package com.virus.springboot.cruddemo.dao;

import com.virus.springboot.cruddemo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITaskRepository extends JpaRepository<Task, Integer> {


//    public List<Task> findAll();
//
//    public void delete(int id);
//
//    public Task findById(int id);
//
//    public Task update(Task task);

}
