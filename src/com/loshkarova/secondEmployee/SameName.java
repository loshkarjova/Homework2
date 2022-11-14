package com.loshkarova.secondEmployee;

import com.loshkarova.Employee;

public class SameName {
    public static Employee getEmployee() {
        Employee employee1 = new Employee();
        employee1.setFullName("John Brain");
        employee1.setPosition("Director");
        employee1.setEmail("br@gmail.com");
        employee1.setPhone("+8-098-493");
        employee1.setAge(32);
        return employee1;
    }

    private SameName() {
    }
}
