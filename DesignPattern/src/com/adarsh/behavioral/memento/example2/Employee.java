package com.adarsh.behavioral.memento.example2;

import java.io.Serializable;
// originator
public class Employee {
    private String name;
    private String email;

    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public EmployeeMemento save(){
        return new EmployeeMemento(name, phone);
    }

    public void revert(EmployeeMemento employeeMemento){
        this.name = employeeMemento.getName();
        this.phone = employeeMemento.getPhone();
    }

}
