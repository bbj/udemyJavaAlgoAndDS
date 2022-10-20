package com.bbj;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // ArrayLists use standard arrays under the hood
        // List<String>: good practice: program to an interface
        // <>(): since 1.8, no need to specify <T> => guessed by compiler
        List<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Daniel");
        names.add("Adam");
        names.add("Ana");
        // random get an item knowing its index
        System.out.println(names.get(1)); //Daniel O(1)
        // remove and return removed item
        System.out.println(names.remove(0)); //Kevin, O(n), have to shift all after removed
        System.out.println(names.get(0)); //Daniel
        // let's iterate
        System.out.println("size: "+names.size());
        for (String name: names) {
            System.out.println(name);
        }
        //size: 3
        //Daniel
        //Adam
        //Ana
    }
}
