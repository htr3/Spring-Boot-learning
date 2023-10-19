package com.virus.cruddemo.dao;

import com.virus.cruddemo.entity.Student;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    public void update(Student theStudent);

    public void delete(Integer id);

    public int deleteAll();


}
