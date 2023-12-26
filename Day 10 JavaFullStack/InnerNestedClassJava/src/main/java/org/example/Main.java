package org.example;

public class Main {
    public static void main(String[] args) {

      /*  Door d = new Door();
        System.out.println(d.islocked("sdsddff"));

        if(d.islocked(args[0])){
            System.out.println("Door is Locked...");
        }
        else {
            System.out.println("Door is Unlocked...");
        } */

        Lock l = new Lock();
        if(l.getCode() == "123456"){
            System.out.println("Door Opened...");
        }
        else{
            System.out.println("Door Closed...");
        }

    }
}