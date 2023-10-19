//package com.virus.springboot.cruddemo.dao;
//
//import com.virus.springboot.cruddemo.entity.Task;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.FluentQuery;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
//@Repository
//public class TaskRepository implements  ITaskRepository{
//
//        private EntityManager entityManager;
//
//        @Autowired
//        public TaskRepository(EntityManager entityManager) {
//                this.entityManager = entityManager;
//        }
//
//        @Override
//        public List<Task> findAll() {
//                TypedQuery<Task> theQuery = entityManager.createQuery("from Task", Task.class);
//
//            return theQuery.getResultList();
//        }
//
//        @Override
//        public void delete(int id) {
//                Task task = entityManager.find(Task.class, id);
//                entityManager.remove(task);
//        }
//
//        @Override
//        public Task findById(int id) {
//                Task task = entityManager.find(Task.class, id);
//                return  task;
//        }
//
//        @Override
//        public Task update(Task tk) {
//                Task task = entityManager.merge(tk);
//                return tk;
//        }
//}
