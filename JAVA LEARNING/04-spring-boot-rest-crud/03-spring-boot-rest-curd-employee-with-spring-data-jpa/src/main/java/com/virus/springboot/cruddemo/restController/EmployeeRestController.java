package com.virus.springboot.cruddemo.restController;

import com.virus.springboot.cruddemo.entity.Employee;
import com.virus.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {


    private EmployeeService employeeService;

    @Autowired
    public  EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee theEmployee = employeeService.findById(employeeId);
        return theEmployee;
    }


    // Add mapping for POST / employees - add new employees

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {

        // also just incase they pass an id in JSON ... SET ID TO 0
        // THIS IS TO FORCE A SAVE OF NEW ITEM ... INSTEAD OF UPDATE

        employee.setId(0);
        Employee dbEmployee =  employeeService.save(employee);
        return dbEmployee;
    }


    // add mappinf for PUT / employees - Update existing employee.
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        Employee dbEmployee = employeeService.save(employee);
        return dbEmployee;
    }

    // add mapping for DELETE /employees/{employeeId} - delete employee

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmplooyee(@PathVariable int employeeId) {


        Employee employee = employeeService.findById(employeeId);

        if(employee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);

        }

        employeeService.deleteById(employeeId);

        return "Deleteed Employee id - "  + employeeId;


    }


}
