package com.company;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class uses HashSet to remove
 * duplicate people.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> duplicates = new ArrayList<>();
        duplicates.add("John Smith 43123");
        duplicates.add("John Smith 43123");
        duplicates.add("John Smith 43123");
        duplicates.add("Joe Smith 43123");
        duplicates.add("Jim Joe 43026");
        System.out.println("List with duplicates");
        for(String e : duplicates) {
            System.out.println(e);
        }
        ArrayList<String> noDups = new ArrayList<>(
                new HashSet<>(duplicates)
        );
        System.out.println("\nList without duplicates");
        for(String e : noDups) {
            System.out.println(e);
        }
    }
}

