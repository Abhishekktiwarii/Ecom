package com.example.Learn.Spring.TightCoupling;

public class UserManager {

    UserDatabase userDatabase = new UserDatabase();

    public String getUserDetail(){
        return userDatabase.getUserDeails();
    }
}
