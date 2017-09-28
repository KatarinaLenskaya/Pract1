package com.catlerina;

public class Main {

    public static void main(String[] args) {
        System.out.println("Have a nice day!");
        print(args);
    }

    public static void print(String[] args) {
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
