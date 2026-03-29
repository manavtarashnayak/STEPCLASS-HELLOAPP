package org.example;

public class HelloApp {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Enhanced for loop (for-each)
        for (String name : args) {
            System.out.println("Hello, " + name + "!");
        }
    }
}