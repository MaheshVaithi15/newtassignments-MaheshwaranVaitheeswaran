package org.example;

public class Main {
    public static void main(String[] args) {

        // switch statements in java
        // lambda exp

        int x=30;

        switch(x) {

            case 1 -> System.out.println("This is not 30");
            case 30 -> System.out.println("Yes This is 30");
            default -> System.out.println("None");
        }

        // for loop in java

        // increment print

        System.out.println("The Increment Print in for loop as below");
        for(int j=0;j<=10;j++){
            System.out.println(j);
        }

        // decrement print

        System.out.println("Decrement Print in for loop below");

        for(int s=10;s>=1;s--){
            System.out.println(s);
        }

        // while loop and do while loop

        int end=5;
        int c=0;

        while(c<=end){
            System.out.println("No:"+c);
            c=c+1;
        }

        System.out.println("Do While Loop");
        do{
            System.out.println("No: "+c);

        }while(c<=end);

        //for each in java

        int []arr = {1,30,45,2,0,-9};

        for(int g:arr){
            System.out.println(g);
        }



    }
}