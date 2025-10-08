package com.example.Learn.Spring.ConstructorInjection;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Details:" + specification);
    }
}
