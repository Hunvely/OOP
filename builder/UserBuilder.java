package oop.builder;

import oop.model.UserDto;

public class UserBuilder {

    private String username;
    private String password;
    private String rePassword;
    private String name;
    private String phoneNumber;
    private String adress;
    private String job;

    public UserBuilder username(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder userPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder userRePassword(String rePassword) {
        this.rePassword = rePassword;
        return this;
    }

    public UserBuilder userName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder userPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder userAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public UserBuilder usreJob(String job) {
        this.job = job;
        return this;
    }

    public UserDto build() {
        return new UserDto(username,password,rePassword,name,phoneNumber,adress,job);
    }
}
