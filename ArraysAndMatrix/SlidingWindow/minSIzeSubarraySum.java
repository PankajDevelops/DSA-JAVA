package ArraysAndMatrix.SlidingWindow;
import java.util.*;

//sliding window template updation

public class minSIzeSubarraySum {
    public static void main(String[] args) {

        /*
         * Input: target = 7, nums = [2,3,1,2,4,3];
         * Output: 2 ;
         * 
         */

         int arr[] = {2,3,1,2,4,3};
         int n = arr.length;
         int k = 7;

         int win = Integer.MAX_VALUE;
         int currSum = 0;

         int i = 0;
         int j = 0;

         while(j<n){

            currSum+=arr[j++];
            while(currSum>=k){
                int currWin = j-i;
                win = Math.min(currWin, win);
                currSum-=arr[i++];
            }

         }


         System.out.println(win);


        
    }
    
}
