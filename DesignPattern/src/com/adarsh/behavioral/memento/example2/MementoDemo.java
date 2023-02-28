package com.adarsh.behavioral.memento.example2;

public class MementoDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Caretaker caretaker = new Caretaker();
        employee.setName("John");
        employee.setEmail("john@gmail.com");
        employee.setPhone("7898675432");

        System.out.println("Employee before save \n"+employee);

        caretaker.save(employee);

        employee.setPhone("1234567890");

        caretaker.save(employee);

        System.out.println("Employee after phone change \n"+employee);

        caretaker.revert(employee);

        System.out.println("After revert \n"+employee);

        caretaker.revert(employee);

        System.out.println("After revert \n"+employee);

    }
}
