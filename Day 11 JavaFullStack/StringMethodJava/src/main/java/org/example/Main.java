package org.example;

public class Main {

    public static void main(String[] args) {

        // String inbuilt java

        String st = "Mahesh";
        String st2 = "Vaithi";

        // to char array

        String c = st+st2;

        char[] str = c.toCharArray();

        //System.out.println("Char Array: "+str);

        System.out.println("Extracting Char from Array: ");

        for(char i : str){
            System.out.println(i);
        }

        // Enum in java

        Learning learning = Learning.GENERICS;

        switch (learning){
            case COREJAVA -> System.out.println("Core JAVA");
            case COLLECTIONS -> System.out.println("Collections");
            case GENERICS -> System.out.println("Generics");
            case JSP -> System.out.println("JSP");
            case MULTITHREADING -> System.out.println("MultiThreading");
        }







    }
}