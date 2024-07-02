// package ArraysAndMatrix.Arrays Lev -2;
import java.util.*;

public class mostFreqEle {

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,1,3,4,2,2,2,2,2,3,3,5,7,8,3,9};
        int n = arr.length;

        // -----------------------------------------------------M1--------------------------------------

        int max = 0;
        int currMax = 0;

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count>currMax){
                currMax = count;
                max = arr[i];
            }
        }

        System.out.println(max);





        // -------------------------------------------------------M2------------------------------------

        // Map<Integer,Integer> mp = new HashMap<>();

        // for(int i=0; i<n; i++){

        //     if(!mp.containsKey(arr[i])){
        //         mp.put(arr[i],1);
        //     }
        //     else{
        //         mp.put(arr[i],mp.get(arr[i])+1);
        //     }
        // }

        // int currMax = 0;
        // int max = 0;

        // for(int num:mp.keySet()){
            
        //     if(mp.get(num)>currMax){
        //         currMax = mp.get(num);
        //         max = num;
        //     }
        // }

        // System.out.println(max);

        

    }
    
}
