package com.virus.demo.restController;

import com.virus.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/virus")
public class StuedentRestController {

    private List<Student> theStudents;


    // define @PostConstruct to load the student data .... only once!
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student("naruto", "uzumaki"));
        theStudents.add(new Student("hinata", "uchiha"));
        theStudents.add(new Student("choji", "mave"));
    }

    // define endpoint for "/students" - return a lost of students

    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        // just index into the list ..... keep it simple for now
        // check the studentId again list size
        if( (studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id is not found  - " + studentId);

        }

        return theStudents.get(studentId);
    }

    // Add an excepiton handler using @ExceptionHandler



}
