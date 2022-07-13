package com.example.a443_java.model;

import java.io.Serializable;

public class User implements Serializable {
    private int age;
    private String name;

    public User(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString(){
        return "User{Name="+name+", Age="+age+'}';
    }
}
