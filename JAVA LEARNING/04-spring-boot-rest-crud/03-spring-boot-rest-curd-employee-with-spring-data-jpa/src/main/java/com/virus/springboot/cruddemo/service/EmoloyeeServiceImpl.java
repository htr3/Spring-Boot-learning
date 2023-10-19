package com.virus.springboot.cruddemo.service;

import com.virus.springboot.cruddemo.dao.EmployeeRepository;
import com.virus.springboot.cruddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmoloyeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;


    @Autowired
    public EmoloyeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;

    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee theEmployee = null;
        if(result.isPresent()) {
            theEmployee = result.get();
        }

        return theEmployee;

    }

    @Override
    public Employee save(Employee theEmployee) {
        Employee employee = employeeRepository.save(theEmployee);
        return employee;
    }

    @Override
    public void deleteById(int theId) {
            employeeRepository.deleteById(theId);
    }
}
