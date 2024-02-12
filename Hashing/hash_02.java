import java.util.HashMap;
import java.util.Set;

public class hash_02 {

    public static void main(String[] args) {

        

        HashMap <String, Integer> hm = new HashMap<>();

        //Insert a data in hashmap O(1)

        hm.put("India",100);
        hm.put("America",94);
        hm.put("Russia",96);

        System.out.println(hm);

        //iteration in HashMap
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("keys"+k+"value"+hm.get(k));
        }


    }
    
}
