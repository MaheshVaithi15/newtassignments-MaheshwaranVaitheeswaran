package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // arrays in java
        // to print an array via user input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // to get user input for an array using for loop
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<size;i++){
             arr[i]= sc.nextInt();
        }
        // to print the array

        System.out.println("The elements in the Array are: ");

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

        // to print for each loop to print individual array

        System.out.println("Individual Array elements Using For each: ");

        for(int s : arr){
            System.out.println(s);
        }

        Main m = new Main();
        m.bsort(arr);



    }

    public void bsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    //swap the arr
                    int temp = 0;
                      temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Arr:");

        for(int a: arr){
            System.out.println(a);
        }
    }
}