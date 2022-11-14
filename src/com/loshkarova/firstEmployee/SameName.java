package com.loshkarova.firstEmployee;

import com.loshkarova.Employee;

public class SameName {
    public static Employee getEmployee() {
        Employee employee = new Employee();
        employee.setFullName("Ann Stone");
        employee.setPosition("Seller");
        employee.setEmail("st@gmail.com");
        employee.setPhone("+8-096-894");
        employee.setAge(25);
        return employee;
    }

    private SameName() {
    }
}
