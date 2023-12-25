package org.example;
import static java.lang.Thread.sleep;
import java.util.*;
public class Main {
    public static void main(String[] args) throws InterruptedException{

   /* MyCounter mc = new MyCounter(1);
    MyCounter mc2 = new MyCounter(2);

    long startTime = System.currentTimeMillis();
    //mc.run();
        mc.start();
    System.out.println("******************");
    sleep(500);
   // mc2.run();
        mc2.start();
    long endTime = System.currentTimeMillis();
    System.out.println("Total time Required: "+(endTime-startTime));  */

    // thread creation

//        Thread t1 = new Thread(new MyCounter(1));
//        Thread t2 = new Thread(new MyCounter(2));
//
//        t1.start();
//        t2.start();


        Thread t1 = new Thread( new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    try {
                        Random r = new Random();
                        sleep(r.nextInt(1000));
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(i);

                }
            }
        } );
        t1.start();
    }
}

/*

//class MyCounter extends Thread{

class MyCounter implements Runnable{
    private int threadno;

    public MyCounter(int threadno) {
        this.threadno = threadno;
    }

    /*@Override
    public void run() {
        try {
            countme();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   public void countme() throws InterruptedException{
        for(int i=0;i<10;i++){
            sleep(500);
            System.out.println("Threads No: "+threadno+" and Iteration No: "+i);
        }
    }

   /* @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Random r = new Random();
                sleep(r.nextInt(3000));
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Threads No: "+threadno+" and Iteration No: "+i);
        }
    }
}
*/


