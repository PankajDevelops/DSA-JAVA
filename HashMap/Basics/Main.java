// package HashMap;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        //Syntax
        Map<String,Integer> mp = new HashMap<>();

        //Adding Elements
        mp.put("Akash",21);
        mp.put("Anil",12);
        mp.put("Saumya",22);
        mp.put("Ritesh",25);
        mp.put("Anshu",28);

        //Getting values of a key from the HashMap
        System.out.println(mp.get("Akash")); //16
        System.out.println(mp.get("Tanmay")); //null

        //  Changing updating value of a key in the  HashMap
        mp.put("Akash",23); //Akash -> 23
        System.out.println(mp.get("Akash")); //23(Updated)

        //  Removing a pair from the HashMap
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("Riya"));

        //  Checking if a key is in theHashMap
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Anshu"));


        //  Adding a new entry only if the new key doesn't exist already

        // Method -  1
        // if(!mp.containsKey("Akash")){
        //     mp.put("Akash",25);
        //} 

        // Method -2 
        mp.putIfAbsent("Akash", 24); //will enter
        mp.putIfAbsent("Saumya", 24); //will not enter

        //  Get all keys in the HashMap
        System.out.println(mp.keySet());

        //  Get all values in the HashMap
        System.out.println(mp.values());

        //  Get all entries in the HashMap
        System.out.println(mp.entrySet());

        //Traversing all entries of HashMap - multiple methods

        for(String key: mp.keySet()){
            System.out.printf("Afe of %s is %d \n",key,mp.get(key));
        }

        System.out.println();

        for(Map.Entry<String,Integer> e:mp.entrySet()){
             System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

        System.out.println();

        // for(var e: mp.entrySet()){
        //     System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        // } (working in java latest version)

        
    }
    
}
