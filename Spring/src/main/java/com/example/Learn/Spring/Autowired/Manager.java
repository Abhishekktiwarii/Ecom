package com.example.Learn.Spring.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {

//    field injection
    @Autowired
//    @Qualifier("employee") // it is used where there are several beans of same name.
    private Employee employee;


//    Constuctor Injection
//    @Autowired
//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
