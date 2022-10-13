package com.edu;

public class App {

    public static void main(String[] args) {
        //
        /*/ 1. Classic Constructor
        User user = new User( "firstname1",  "lastname1",  "login1",
                "password1",  "address1",  "email1",  "phone1");
        System.out.println("email = " + user.getEmail());
        */
        //
        /* 2. Default Constructor and setters
        User user = new User();
        user.setFirstname("firstname2");
        user.setLastname("lastname2");
        user.setLogin("login2");
        user.setPassword("password2");
        user.setAddress("address2");
        user.setEmail("email2");
        user.setPhone("phone2");
        System.out.println("email = " + user.getEmail());
        */
        //
        /* 3. Add Fluent interface
        User user = new User()
            .setFirstname("firstname3")
            .setLastname("lastname3")
            .setLogin("login3")
            .setPassword("password3")
            .setAddress("address3")
            .setEmail("email3")
            .setPhone("phone3");
        System.out.println("email = " + user.getEmail());
        */
        //
        /* 4. Static Factory
        User user = User.get()
            .setFirstname("firstname4")
            .setLastname("lastname4")
            .setLogin("login4")
            .setPassword("password4")
            .setAddress("address4")
            .setEmail("email4")
            .setPhone("phone4");
        System.out.println("email = " + user.getEmail());
        */
        //
        /* 5. Builder by interfaces
        User user = User.get()
                .setFirstname("firstname5")
                .setLastname("lastname5")
                .setLogin("login5")
                .setPassword("password5")
                .setEmail("email5")
                .setAddress("address5")
                .build();
        //System.out.println("email = " + user.setEmail("")); // Code Smell
        //
        System.out.println("email = " + user.getEmail());
        */
        // 6. Dependency inversion
        IUser user = User.get()
                .setFirstname("firstname6")
                .setLastname("lastname6")
                .setLogin("login6")
                .setPassword("password6")
                .setEmail("email6")
                .setAddress("address6")
                .build();
        //System.out.println("email = " + user.setEmail("")); // Compile Error
        //System.out.println("email = " + ((User) user).setEmail("")); // Code Smell
        //
        System.out.println("email = " + user.getEmail());
        //
        System.out.println("done");
    }
}
