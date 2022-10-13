package com.edu;

interface IFirstname {
    ILastname setFirstname(String firstname);
}

interface ILastname {
    ILogin setLastname(String lastname);
}

interface ILogin {
    IPassword setLogin(String login);
}

interface IPassword {
    IEmail setPassword(String password);
}

interface IEmail {
    IBuildUser setEmail(String email);
}

interface IBuildUser {
    IBuildUser setAddress(String address);
    IBuildUser setPhone(String phone);

    IUser build();
}

public class User implements IFirstname, ILastname, ILogin, IPassword, IEmail, IBuildUser, IUser {

    private String firstname; // = null by default
    private String lastname;
    private String login;
    private String password;
    private String address; // optional
    private String email;
    private String phone; // optional

    /* 1. Classic Constructor
    public User(String firstname, String lastname, String login, String password, String address, String email, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.address = address; // optional
        this.email = email;
        this.phone = phone; // optional
    }
    */

    // 2. Default Constructor and setters
    //  public User() {
    // 4. Static Factory
    private User() {
        firstname = "";
        lastname = "";
        login = "";
        password = "";
        address = ""; // optional
        email = "";
        phone = ""; // optional
    }

    // 4. Static Factory
    //public static User get() {
    // 5. Builder by interfaces
    public static IFirstname get() {
        return new User();
    }

    // setters

    // 2. Default Constructor and setters
    //public void setFirstname(String firstname) {
    // 3. Add Fluent interface
    // public User setFirstname(String firstname) {
    // 5. Builder by interfaces
    public ILastname setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public ILogin setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public IPassword setLogin(String login) {
        this.login = login;
        return this;
    }

    public IEmail setPassword(String password) {
        this.password = password;
        return this;
    }

    public IBuildUser setAddress(String address) {
        this.address = address;
        return this;
    }

    public IBuildUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public IBuildUser setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public IUser build() {
        return this;
    }

    //  getters


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
