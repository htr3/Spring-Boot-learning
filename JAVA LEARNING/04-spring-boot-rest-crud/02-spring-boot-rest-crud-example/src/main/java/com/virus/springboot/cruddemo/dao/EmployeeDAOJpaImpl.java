package com.virus.springboot.cruddemo.dao;

import com.virus.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmloyeeDAO {

    // define field for entitymanager

    private EntityManager entityManager;



    // set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        // create query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee ", Employee.class);


        // excutet query
        List<Employee> employees = theQuery.getResultList();

        // return query
        return employees;


    }

    @Override
    public Employee findById(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        Employee dbEmployee = entityManager.merge(theEmployee);

        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {
            Employee employee = entityManager.find(Employee.class, theId);
            entityManager.remove(employee);
    }
}
