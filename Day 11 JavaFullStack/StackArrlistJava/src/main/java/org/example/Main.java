package org.example;

import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {

        // stack operations in java

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size =  sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        System.out.println("Stack Push Operation: ");
        System.out.println("Enter the element to be pushed: ");
        for (int i=0;i<size;i++){
            stack.push(sc.nextInt());

        }

        System.out.println("Display Stack: "+stack);

        // to search the element
        System.out.println("Enter element to be searched: ");
        int s = sc.nextInt();

        System.out.println("Searched Element: "+stack.search(s));

        System.out.println("Poped Element: "+stack.pop());

        //pop operation



    }
}