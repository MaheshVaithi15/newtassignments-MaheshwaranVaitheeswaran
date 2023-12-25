package org.example;
public class Main {
    public static void main(String[] args) {

        // arithmetic operator

        int x = 300/10;
        String text = "Mahesh" + "Vaithi";
        System.out.println(x);
        System.out.println("String concat using + is :"+text);

        // 2
        int mod = 16%4;
        int a = 10;
        System.out.println("Decrement "+a--);
        System.out.println("Basic X value "+a);

        // ternary operator


        String st = "Mahesh";

       String res = (st=="Mahesh") ? "The Entered name is same" : "The name is Diff";

        System.out.println(" "+res);

    }
}