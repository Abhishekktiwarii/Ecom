package com.example.Learn.Spring.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyBean bean = (MyBean) context.getBean("myBean");
        System.out.println(bean);
    }
}
