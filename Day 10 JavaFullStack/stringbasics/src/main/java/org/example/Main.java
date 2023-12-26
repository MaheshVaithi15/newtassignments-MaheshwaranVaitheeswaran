package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println("String Basics : ");

        String name = "Mahesh \u00f1";
        String no = "2";
        int n = 20;
        System.out.println(Integer.parseInt(no)+10);
        System.out.println("The Number in the form of str "+no);

        // typecasting in java from string to int and all

        System.out.println("Typecast in java ");

        short a1 = 200;
        byte a2 = (byte)a1;
        System.out.println(a2);

        // typecast 2

        float b = 10.5f;
        int i = (int)b;
        System.out.println(i);


    }
}