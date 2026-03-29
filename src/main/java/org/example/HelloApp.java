package org.example;

public class HelloApp {
    public static void main(String[] args) {

        String name = (args.length >= 1) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");
    }
}