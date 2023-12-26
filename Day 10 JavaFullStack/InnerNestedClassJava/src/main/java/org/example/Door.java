package org.example;

public class Door {

    public boolean islocked(String key){
        class Lock{
            public boolean islocked(String key){
                if(key.equals("qwerty")){
                    return false;
                }
                {
                    return true;
                }
            }

        }

        return new Lock().islocked(key);
    }

}
