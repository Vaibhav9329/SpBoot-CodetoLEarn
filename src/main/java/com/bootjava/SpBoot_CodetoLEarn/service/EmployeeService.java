package com.bootjava.SpBoot_CodetoLEarn.service;


import com.bootjava.SpBoot_CodetoLEarn.dto.EmployeeDto;
import com.bootjava.SpBoot_CodetoLEarn.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootjava.SpBoot_CodetoLEarn.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeDto getEmployee(Integer id){
        Employee employee =  employeeRepository.getEmployee(id);
        EmployeeDto employeeDto = new EmployeeDto();
       return employeeDto.EmployeeMapper(employee);
    }
}
