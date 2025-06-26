package Arrays;

import java.util.*;
public class subArraySum {

    public static void main(String[] args) {

        List<List<Integer>> ans = new ArrayList<>();
        
        
        int arr[] = {3,4,-7,1,3,3,1,-4};
        int k = 7;

        int n = arr.length;

        for(int i=0; i<n; i++){
            int sum = 0;
            List<Integer> ls = new ArrayList<>();
            for(int j = i; j<n; j++){
                sum+=arr[j];
                ls.add(arr[j]);
                if(sum==k){
                    ans.add(new ArrayList<>(ls));
                }
            }
        }

        System.out.println(ans);


    }
    
}
