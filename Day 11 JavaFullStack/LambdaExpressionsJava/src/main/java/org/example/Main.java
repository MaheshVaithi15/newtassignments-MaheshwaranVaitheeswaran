package org.example;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       /* Lambda l = ()->{

            System.out.println("Statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");
        };

        l.demo();*/
/*
        Thread t1 = new Thread(()-> {System.out.println("Statement 01");
            System.out.println("Statement 02");

            System.out.println("Statement 03");
            System.out.println("Statement 04");});

        t1.start(); */

        List<Integer> list;
        list = new Arrays.asList(45,90,100,20,100,1,98);
        list.forEach(i -> System.out.println(i) );

    }
}
/*
interface Lambda{
    public void demo();
} */