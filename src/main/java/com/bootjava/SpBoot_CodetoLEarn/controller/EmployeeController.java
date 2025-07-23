package com.bootjava.SpBoot_CodetoLEarn.controller;


import com.bootjava.SpBoot_CodetoLEarn.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.bootjava.SpBoot_CodetoLEarn.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping( "/getEmployee/{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable Integer id){
    EmployeeDto employee = employeeService.getEmployee(id);
    return ResponseEntity.ok(employee);
    }
}
