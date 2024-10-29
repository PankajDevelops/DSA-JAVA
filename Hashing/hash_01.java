package Hashing;

import java.util.*;

public class hash_01 {

    public static void main(String[] args) {

        HashMap <String, Integer> hm = new HashMap<>();

        //Insert a data in hashmap O(1)
        hm.put("India",100);
        hm.put("America",94);
        hm.put("Russia",96);

        System.out.println(hm);

        //Get - O(1)
        int value = hm.get("India");
        System.out.println(value);
        System.out.println(hm.get("Indonesia"));

        //Contains - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //Remove
        hm.remove("America");
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
        






        
    }

}
