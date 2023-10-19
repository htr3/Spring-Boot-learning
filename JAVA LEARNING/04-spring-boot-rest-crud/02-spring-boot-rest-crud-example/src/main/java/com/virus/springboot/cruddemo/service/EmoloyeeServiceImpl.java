package com.virus.springboot.cruddemo.service;

import com.virus.springboot.cruddemo.dao.EmloyeeDAO;
import com.virus.springboot.cruddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmoloyeeServiceImpl implements EmployeeService {

    private EmloyeeDAO employeeDAO;


    @Autowired
    public EmoloyeeServiceImpl(EmloyeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
         Employee employee = employeeDAO.findById(id);
        return employee;
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        Employee employee = employeeDAO.save(theEmployee);
        return employee;
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
            employeeDAO.deleteById(theId);
    }
}
