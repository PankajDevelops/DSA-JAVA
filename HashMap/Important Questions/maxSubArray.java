import java.util.*;

public class maxSubArray {

    public static int subArray (int arr[], int n){

        Map <Integer,Integer> mp = new HashMap<>();

        int prefixSum = 0;
        int maxLen = 0;
        mp.put(0,-1);

        for(int i=0; i<n; i++){

            prefixSum+=arr[i];
            if(mp.containsKey(prefixSum)){
                maxLen = Math.max(maxLen, i - mp.get(prefixSum));
            }
            else{
                mp.put(prefixSum,i);
            }

        }

        return maxLen;

    }

    public static void main(String[] args) {

        int arr[] = {15,-2,2,-8,1,7,1,0};

        System.out.println(subArray(arr, 8));

        
    }
    
}
