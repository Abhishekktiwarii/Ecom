package com.example.Learn.Spring.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(Appconfig.class);
//        remember here AnnotationConfig
        Employee emp = (Employee) context.getBean("employee");
        System.out.println(emp.toString());



        Manager  manager = (Manager) context.getBean("manager");
        System.out.println(manager.toString());
    }
}
