package com.virus.springboot.cruddemo.restcontroller;

import com.virus.springboot.cruddemo.dao.ITaskRepository;
//import com.virus.springboot.cruddemo.dao.TaskRepository;
import com.virus.springboot.cruddemo.entity.Task;
import com.virus.springboot.cruddemo.service.ITaskService;
import com.virus.springboot.cruddemo.service.TaskServiceimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RestController
@RequestMapping("/api")
public class TaskController {


    ITaskService iTaskService;

    @Autowired
    public TaskController(TaskServiceimple iTaskService) {
        this.iTaskService = iTaskService;
    }

    @GetMapping("/findAll")
    public List<Task> findAll(){
        return iTaskService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
         iTaskService.delete(id);
    }

    @GetMapping("/findById/{id}")
    public Task findById(@PathVariable int id){
        return iTaskService.findById(id);
    }

    @PutMapping("update")
    public void update(@RequestBody Task task) {
         iTaskService.update(task);
    }
}
