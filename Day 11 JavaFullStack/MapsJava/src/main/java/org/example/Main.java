package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //HashMap and TreeMap

        // hashmap implementation

       // Map<String,String> hmap = new HashMap<>();



        System.out.print("Size of map: ");
        int size = sc.nextInt();

   /*
        System.out.println("Enter elements into hashmap: ");
        for(int i=0;i<size;i++){
            hmap.put(sc.next(), sc.next());
        }

        // to disp elements in hashmap
        System.out.println("Elements in the Hashmap: "+hmap);

        // to iterate into hashmap
        System.out.println("To iterate into Hashmap");

        for(String key:hmap.keySet()){
            System.out.println("Key: "+key+" Value:"+hmap.get(key));
        }
   */

        //treemap implementation

        Map<String,String> tmap = new TreeMap<>();

        System.out.println("Enter elements into Treemap: ");
        for(int i=0;i<size;i++){
            tmap.put(sc.next(), sc.next());
        }

        // to disp elements in hashmap
        System.out.println("Elements in the Treemap: "+tmap);

        // 


    }
}