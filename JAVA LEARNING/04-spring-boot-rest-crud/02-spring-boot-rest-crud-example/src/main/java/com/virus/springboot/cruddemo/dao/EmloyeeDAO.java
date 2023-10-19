package com.virus.springboot.cruddemo.dao;

import com.virus.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmloyeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save (Employee theEmployee);

    void deleteById(int theId);


}
