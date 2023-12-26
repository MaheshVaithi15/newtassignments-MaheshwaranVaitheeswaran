package org.example;

public class Iphone implements Phone,IOS {
    public String processor(){
        return "A16-Bionic";
    }

    public int spaceInGB(){
        return 256;
    }

    public String airdrop(){
        return "Copy and Paste Anywhere....";
    }
}
