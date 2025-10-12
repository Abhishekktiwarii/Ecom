package com.example.Learn.Spring.Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("ComponentScan.xml");
        Employee emp = (Employee) context.getBean("employee");
        System.out.println(emp.toString());
    }
}
