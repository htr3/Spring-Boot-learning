package com.standalone.standalone.service;


import com.standalone.standalone.model.EmployeeMissingSkillset;
import com.standalone.standalone.model.EmployeeSkillset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidateSkillsApplicationService {

    @Autowired
    EmployeeMissingSkillset employeeMissingSkillset;
    public EmployeeMissingSkillset validateSkills(EmployeeSkillset employeeSkillset) {
        employeeMissingSkillset.setEmpId(employeeSkillset.getEmpId());

        employeeSkillset.getRequiredSkills().removeIf(skill -> employeeSkillset.getActualSkills().stream().anyMatch(skill2 -> skill2.equalsIgnoreCase(skill)));
        employeeMissingSkillset.setMissingSkills(employeeSkillset.getRequiredSkills());
        return employeeMissingSkillset;

    }
}
