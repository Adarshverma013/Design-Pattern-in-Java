package com.adarsh.behavioral.memento.example2;

// memento or State
public class EmployeeMemento {
    private String name;
    private String phone;

    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
