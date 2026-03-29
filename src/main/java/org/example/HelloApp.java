package org.example;

public class HelloApp {
    public static void main(String[] args) {

        // Check if user provided a name
        if (args.length < 1) {
            System.out.println("Usage: java Main <name>");
            return;
        }

        String name = args[0];

        System.out.println("Hello, " + name + "!");
    }
}