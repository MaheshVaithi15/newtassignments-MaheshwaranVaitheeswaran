package org.example;

public class Samsung implements Phone,Android{
    public String processor(){
        return "SD-888";
    }

    public int spaceInGB(){
        return 256;
    }

    public String opensource(){
        return "OpenSource OS with Unique UI...";
    }
}
