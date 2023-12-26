package org.example;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {

        // java generics

       /* List<Data> ele = new LinkedList<>();

        ele.add(new Data("Mahesh"));
        ele.add(new Data("$$"));
        ele.add(new Data(25));
        ele.add(new Data(10.90));
        System.out.println("The Element in the list: "+ele);*/

       /* Data d = new Data("mahesh");

        String x = (String) d.getObj();

        System.out.println(x); */


        GenerticData<String> g = new GenerticData<>("Some Genric Data..");

        String y = g.getData();

        System.out.println("The Data in Generic Type: "+y);



    }
}

class Data{
    private Object obj;

    public Data(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    /* @Override
    public String toString() {
        return obj.toString();
    }*/
}


class GenerticData<T>{
    private T data;

    public GenerticData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}