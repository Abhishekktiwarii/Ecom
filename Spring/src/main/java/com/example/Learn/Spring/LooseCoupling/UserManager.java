package com.example.Learn.Spring.LooseCoupling;

public class UserManager {

    UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider){
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo(){
        return userDataProvider.getUserDeails();
    }


}
