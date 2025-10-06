package com.example.Learn.Spring.LooseCoupling;

public class LooseCouplingExample {

    public static void main(String[] args) {
        UserDataProvider userDatabaseProvider = new UserDatabaseProvider();
        UserManager userManager = new UserManager(userDatabaseProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider webProvider = new WebDataProvider();
        UserManager webManager = new UserManager(webProvider);
        System.out.println(webManager.getUserInfo());
    }
}
 