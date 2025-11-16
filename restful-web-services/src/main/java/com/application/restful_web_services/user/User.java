package com.application.restful_web_services.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;


public class User {
    private int id;    
    @Size(min=2, message="Name should have at least 2 characters")
    private String name;    
    @Past(message = "Birth date should be in the past")
    private LocalDate birthDate;
    public User(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
    }
}
