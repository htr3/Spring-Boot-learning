package com.virus.cruddemo.dao;

import com.virus.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    // define field for entity manager

    private EntityManager entityManager;
    // inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    // implement save method
    @Override
    @Transactional
    public  void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student", Student.class);
        return theQuery.getResultList();
    }

    public List<Student> findByLastName(String theLastName) {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student where lastName=:theData", Student.class);

        // set query parameters
        theQuery.setParameter("theData", theLastName);
        // return query results
        return theQuery.getResultList();
    }

    @Transactional
    public void update(Student theStudent)  {

        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        // retrieve teh stuente
        Student theStuent = entityManager.find(Student.class, id);

        // delete the student
        entityManager.remove(theStuent);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE from Student").executeUpdate();

        return numRowsDeleted;
    }

}
