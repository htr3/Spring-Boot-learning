package com.standalone.standalone.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeMissingSkillset {
    String empId;
    List<String> missingSkills = new ArrayList<>();



    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public List<String> getMissingSkills() {
        return missingSkills;
    }
    public void setMissingSkills(List<String> missingSkills) {
        this.missingSkills = missingSkills;
    }}
