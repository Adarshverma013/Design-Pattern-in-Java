package com.adarsh.behavioral.iterator.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bryan");
        names.add("Charlie");
        names.add("Jake");
        Iterator<String> it = names.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
