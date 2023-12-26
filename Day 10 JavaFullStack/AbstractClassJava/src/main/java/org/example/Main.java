package org.example;

public class Main {
    public static void main(String[] args) {

    Person nijan = new Nijan();

    nijan.eat();
    nijan.speak();

    Person pravin = new Pravin(){
        public void speak(){
            System.out.println("Anna Vaazhga !....");
        }
    };
    pravin.eat();
    pravin.speak();


    }
}