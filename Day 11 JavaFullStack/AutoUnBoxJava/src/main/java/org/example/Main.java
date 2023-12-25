package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;


  class Wrapper{

    public int num;

    // autoboxing and unboxing


    public Wrapper(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Size of List: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements into the List: ");
        for(int i=0;i<size;i++){
            arr.add(sc.nextInt());
        }

        // to view the elements in the list

        System.out.println("Elements in the List are: "+arr);

        // implementing autoboxing here
        ArrayList<Wrapper> arr2 = new ArrayList<>();
        arr2.add(new Wrapper(90)); // boxing


        System.out.println("Auto Boxing: "+arr.get(0)); //unboxing







    }
}