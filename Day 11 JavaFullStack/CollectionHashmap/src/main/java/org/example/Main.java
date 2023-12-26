package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);

        //set implementation in java

        Set<String> s = new HashSet<>();


        System.out.println("Enter Size: ");
        int size = sc.nextInt();

        System.out.println("Names added in set");

        for(int i=0;i<size;i++){
            s.add(sc.next());
        }

        //disp set
        System.out.println("set elements are: "+s); */

        //types of sets

        // Hashset LinkedHashSet and TreeSet


        Set<String> hset = new HashSet<>();

        // used to store element in hashset

        for(int i=20;i>=0;i--){
            hset.add("S"+i);
        }
        System.out.println("Values Stored in Hashset are: "+hset);



        //linked hashset

        Set<String> lset = new LinkedHashSet<>();
        // used to store element in linkedhashset

        for(int i=20;i>=0;i--){
            lset.add("S"+i);
        }
        System.out.println("Values Stored in Linked Hashset are: "+lset);



        //tree set

        Set<String> tset = new TreeSet<>();
        // used to store element in treeset

        for(int i=20;i>=0;i--){
            tset.add("S"+i);
        }
        System.out.println("Values Stored in Treeset are: "+tset);



        //tree set with integer

        Set<Integer> inset = new TreeSet<>();
        // used to store element in integer treeset

        for(int i=20;i>=0;i--){
            inset.add(i);
        }
        System.out.println("Values Stored in integer Treeset are: "+inset);




    }
}