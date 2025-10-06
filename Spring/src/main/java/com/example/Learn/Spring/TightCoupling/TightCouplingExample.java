package com.example.Learn.Spring.TightCoupling;

public class TightCouplingExample {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserDetail());
    }
}
