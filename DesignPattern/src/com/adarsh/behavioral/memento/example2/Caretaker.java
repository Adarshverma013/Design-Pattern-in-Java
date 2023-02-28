package com.adarsh.behavioral.memento.example2;

import java.util.Stack;

// caretaker to manage history
public class Caretaker {
    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee e){
        employeeHistory.push(e.save());
    }

    public void revert(Employee e){
        e.revert(employeeHistory.pop());
    }

}
