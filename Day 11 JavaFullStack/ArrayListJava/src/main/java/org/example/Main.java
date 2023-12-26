package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // array list implementation

        System.out.println("Array List Implementation: ");

        System.out.println("Enter the size of list: ");

        int size = sc.nextInt();


        ArrayList<String> list = new java.util.ArrayList<java.lang.String>();

        System.out.println("Enter the Strings into List:");
        for(int i=0;i<size;i++){
            list.add(sc.next());
        }
        // to view the elements in the list
        System.out.println("Strings in the List are: "+list);

        //for each to view the list
        System.out.println("Iterate through list: ");
        for(String s : list){
            System.out.println(s);
        }










    }
}