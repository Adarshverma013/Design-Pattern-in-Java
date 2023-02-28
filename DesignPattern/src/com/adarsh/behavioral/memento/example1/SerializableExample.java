package com.adarsh.behavioral.memento.example1;

import java.io.*;

public class SerializableExample {
    private static Employee deserialize(){
        Employee emp = null;
        try{
            FileInputStream filein = new FileInputStream("employee.ser");
            ObjectInputStream objectIn = new ObjectInputStream(filein);
            emp = (Employee) objectIn.readObject();
            objectIn.close();
            filein.close();
        }catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
        return emp;
    }
    private static void serialize(Employee emp){
        try{
            FileOutputStream fileout = new FileOutputStream("employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileout);
            objectOutputStream.writeObject(emp);
            objectOutputStream.close();
            fileout.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Martin");
        emp.setEmail("martha@gmail.com");
        emp.setPhone("7823903245");

        serialize(emp);

        Employee employee = deserialize();
        System.out.println(employee);
    }
}
