package com.bootjava.SpBoot_CodetoLEarn.repository;

import com.bootjava.SpBoot_CodetoLEarn.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public Employee getEmployee(Integer id){
        return new Employee(1,"chetan","MCA",21);

    }
}
