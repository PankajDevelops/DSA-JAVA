import java.util.*;

public class twoSUM {

    public static int[] twoSum (int arr[], int t){

        int ans[] = new int [2];
        ans[0] = -1;
        int n = arr.length;

        Map <Integer,Integer> mp = new HashMap<>();

        for(int i=0; i<n; i++){

            int part = t - arr[i];

            if(mp.containsKey(part)){
                ans[0]=i;
                ans[1]=mp.get(part);
                 return ans;
            }
            mp.put(arr[i],i);

        }

        return ans;

    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};

        int t = 11;

        int brr[] = new int[2];

        brr = twoSum(arr, t);

        for(int i=0; i<brr.length; i++){
            System.out.print(brr[i]+" ");
        }




        
        
    }
    
}
