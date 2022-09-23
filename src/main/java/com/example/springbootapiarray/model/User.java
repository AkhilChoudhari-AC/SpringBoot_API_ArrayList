package com.example.springbootapiarray.model;

import com.example.springbootapiarray.dto.Userdto;

public class User {

    public String firstName;
    public String lastName;
    public int id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //making use of copy constructor
    public User (User user) {
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.id = user.id;
    }
    public User(int id, Userdto userdto){
        this.id = id;
        this.firstName=userdto.firstName;
        this.lastName=userdto.lastName;
    }

}
