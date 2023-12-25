package org.example;

import org.example.blog.Home;

public class Main {
    public static void main(String[] args) {

       /* Child c = new Child();
        //System.out.println(c.getX());

        c.India();
        c.USA(); */

        Home h1 = new Home();
        h1.message();

        org.example.store.Home h2 = new org.example.store.Home();
        h2.message();

        // we can use same class name with different package








    }
}