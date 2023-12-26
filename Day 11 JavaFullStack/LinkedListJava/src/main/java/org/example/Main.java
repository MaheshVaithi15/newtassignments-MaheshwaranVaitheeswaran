package org.example;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
    //linked list in java

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size: ");
        int size = sc.nextInt();

        LinkedList<Integer> llist = new LinkedList<>();

        // enquque operation
        System.out.println("Enter the Elements into Linked List: ");
        for(int i=0;i<size;i++){
            llist.add(sc.nextInt());
        }

        // to disp linked list

        System.out.println("Elements in the Linked List: "+llist);

        //dequeue operation
        System.out.println("Element Dequeued: "+llist.remove(0));


    }
}