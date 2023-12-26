package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        // to solve an equation
        System.out.println("To Solve the eqn:");

        //(a+b)^2=a^2+b^2+2ab;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of B: ");
        float b= sc.nextFloat();

        double val = a*a + 2*a*b + b*b;

        System.out.println("The Ans of (a+b)^2 "+val);




    }
}