package org.example;

public class HelloApp {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join names with delimiter ", "
        String names = String.join(", ", args);

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}