package org.example;
public class Main {
    public static void main(String[] args) {
        // Java Methods

        //loopsum();

        //loop();

       System.out.println("Area Of Circle :"+circle(45));
        System.out.println("Perimeter Of Circle :"+circle(28.9));


    }

   /* public static void loopsum(){
        int s=0;
        System.out.println("Method 1");
        for(int i=0;i<=10;i++){
            s=s+i;
        }

        System.out.println("Sum of 10 Numbers: "+s);
    }*/

    /*public static void loop(){
        System.out.println("Method 2");
        System.out.println("Increment of 5 numbers");
        for(int j=0;j<=5;j++){
            System.out.println(j);
        }*/


       // return value in method
        // method overloading

        public static double circle(int radius) {
            return 3.14*radius*radius;
        }



        public static double circle(double r){
            return 2*3.14*r;

        }






    }
