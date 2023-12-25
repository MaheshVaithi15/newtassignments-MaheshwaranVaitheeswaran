package org.example;
import java.util.*;

public class Main {
    public static int counter=0;
    public static void main(String[] args) throws InterruptedException {


        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=10000;i++){
                    Main.counter++;
                }
                System.out.println("Thread 1 Over");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=10000;i++){
                    Main.counter++;
                }
                System.out.println("Thread 2 Over");
            }
        }).start();
        Thread.sleep(300);
        System.out.println("Thread: "+counter);
    }
}
