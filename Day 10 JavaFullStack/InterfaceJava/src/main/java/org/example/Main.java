package org.example;

public class Main {
    public static void main(String[] args) {
        Samsung s1 = new Samsung();
        System.out.println("Samsung Phone Processor: "+s1.processor());
        System.out.println("Total Memory "+s1.spaceInGB());
        System.out.println("Feature "+s1.opensource());



        Iphone s2 = new Iphone();
        System.out.println("Iphone Phone Processor: "+s2.processor());
        System.out.println("Total Memory "+s2.spaceInGB());
        System.out.println("Feature "+s2.airdrop());




    }
}