package org.example;

import java.util.*;
public class Main {
    public static void main(String[] args)  {

        Brackets b = new Brackets();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    b.generate();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    b.generate();
                }
            }
        }).start();

    }
}

class Brackets {
    synchronized public void generate() throws InterruptedException{
        for (int i = 0; i <= 20; i++) {
            if (i <= 10) {
                Thread.sleep(5);
                System.out.print('[');
            } else {
                System.out.print(']');
            }
        }
        System.out.println();
    }
}