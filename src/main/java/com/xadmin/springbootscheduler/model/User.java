package com.xadmin.springbootscheduler.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name = "userData")
public class User {
    @jakarta.persistence.Id
    @GeneratedValue
    private int Id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
