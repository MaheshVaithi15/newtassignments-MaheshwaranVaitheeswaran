package org.example;

public class Main {
    public static void main(String[] args) {

        Data<Integer,String> data = new Data<>(10,"Mahesh");

       // System.out.println(data);

        data.disp("test",30);


    }
}

class Data<K,V>{
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public <E,N> void disp(E element,N number){

        System.out.println("Element: "+element+" Number: "+number);

    }
}