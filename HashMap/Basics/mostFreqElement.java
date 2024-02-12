// package HashMap;
import java.util.*;
public class mostFreqElement {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,1,1,2,3,1,42,1,5,5,5,5,5,5,5,5,5};
        int n = arr.length;

        Map<Integer,Integer> mp = new HashMap<>();

        for(int el:arr){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            }
            else{
                mp.put(el,mp.get(el)+1);
            }
        }

        System.out.println("Frequency Map");
        System.out.println(mp.entrySet());

        int maxFeq = 0;
        int ansKey = 0;

        for(int key: mp.keySet()){
            if(mp.get(key)>maxFeq){
                maxFeq = mp.get(key);
                ansKey = key;
            }

        }

        System.out.println(ansKey+" "+maxFeq);

        
    }
    
}
