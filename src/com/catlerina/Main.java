package com.catlerina;

public class Main {

    public static void main(String[] args) {
        System.out.println("Have a nice day!");
        sort(args);
        print(args);
    }

    public static void print(String[] args) {
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }

    public static void sort(String[] args){
        if(args != null && args.length>0){
            for (int i = args.length - 1; i > 0; i--) {//this loop help us not to compare those elements we have already sorted
                for (int j = 0; j < i; j++){
                    if(args[j].compareTo(args[j+1]) > 0){
                        String temporary = args[j];
                        args[j] = args[j+1];
                        args[j+1] = temporary;
                    }
                }
            }
        }
    }
}
