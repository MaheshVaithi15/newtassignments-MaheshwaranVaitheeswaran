package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args)  {

        


        /*Main m = new Main();
        try {
            m.doSomething();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/
       /* System.out.println("String Handling");
        String a = "Mahesh";
        String b = "Vaithi";

        String c=a+b; //concat string

        System.out.println("The Concat String: "+c);*/

        // Exception handling
       /* System.out.println("Exception Handling");

        int x = 10;
        int y = 0;

        try {

            int res = x / y;
            System.out.println("Result Of :"+res);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }

        // Multiple Exception

        int n1=200;
        int n2=0;

        try{

            int s = n1/n2;
            System.out.println("Result of: "+s);
        }
        catch (Exception e){

            System.out.println(e);
        }
        finally {
            System.out.println(n1);
        }*/


        //user defined exception



        }

        class ZeroExpection extends Exception {

            public void doSomething() throws ZeroExpection {

               // FileReader fr = new FileReader("text.txt");

                String z = "Zero";

                if(z.equals("Zero")){
                    throw new ZeroExpection();
                }

                System.out.println("Do Something");


            }
        }

    }
