package com.standalone.standalone.controller;

import com.standalone.standalone.model.EmployeeMissingSkillset;
import com.standalone.standalone.model.EmployeeSkillset;
import com.standalone.standalone.service.ValidateSkillsApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ValidateSkills {

    @Autowired
    ValidateSkillsApplicationService validateSkillsApplicationService;


    @PostMapping("/employeemanagement/v1/validateEmployeeSkills")
    public ResponseEntity validSkills(@RequestBody EmployeeSkillset employeeSkillset) {
        System.out.println("VIshal here! Just fun!!!");
        EmployeeMissingSkillset employeeMissingSkillset =  validateSkillsApplicationService.validateSkills(employeeSkillset);
        return new ResponseEntity(employeeMissingSkillset, HttpStatus.CREATED);
    }

}

