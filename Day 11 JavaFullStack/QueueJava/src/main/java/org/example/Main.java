package org.example;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new LinkedBlockingQueue();

        System.out.println("Enter the size: ");
        int size = sc.nextInt();


        //enqueue operation
        System.out.println("Add the elements in the Queue");
        for(int i=0;i<size;i++){
            q.offer(sc.nextInt());
        }

        //display queue
        System.out.println("Queue Elements: "+q);

        // dequeue Operation:

        System.out.println("Element Dequeued: "+q.poll());


    }
}