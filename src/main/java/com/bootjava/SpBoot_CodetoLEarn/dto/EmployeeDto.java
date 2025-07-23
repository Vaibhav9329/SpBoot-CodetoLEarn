package com.bootjava.SpBoot_CodetoLEarn.dto;

import com.bootjava.SpBoot_CodetoLEarn.entity.Employee;

public class EmployeeDto {
    String name;
    String dept;
    Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public EmployeeDto EmployeeMapper(Employee employee) {
       this.setName(employee.getName());
       this.setDept(employee.getDept());
       this.setAge(employee.getAge());
       return this;
    }
}
