package org.example;
import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        String[] starr = {"one","two","three"};
        new Data().printarr(starr);

        Integer[] intarr = {10,22,35,100,0};
        new Data().printarr(intarr);



    }
}

class Data{

    public <E> void printlist(List<E> list){
        System.out.println("Print List Elements: ");
        for(E ele:list){
            System.out.println(ele);
        }
    }

    public <E> void printarr(E[] arr){
        System.out.println("Print Array Elements: ");
        for(E ele:arr){
            System.out.println(ele);
        }
    }
}