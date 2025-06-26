package DSA.HashMap;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        int arr[] = {1,1,2,2,2,2,2,1,3,3,3,4,5,7,6,4,3,5,6,7,8,5,4,4,4,4,4};
        int n = arr.length;

        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0; i<n; i++){

            // if(!mp.containsKey(arr[i])){
            //     mp.put(arr[i],1);
            // }
            // else{
            //     mp.put(arr[i],mp.get(arr[i])+1);
            // }

            mp.put(arr[i],mp.getOrDefault(arr[i], 1)+1);
        }


        int max = 0;
        int curr = 0;

        for(int num:mp.keySet()){
            curr = mp.get(num);
            if(curr>max){
                max = num;
            }
        }
        
        System.out.println(max);
        System.out.println(mp);


    }
    
}
