package ArraysAndMatrix.ArraysLevel_03;
import java.util.*;

public class subArraySum {

    public static int maxSubArraySum(int arr[]){

        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<n; i++){
            currSum+=arr[i];
            if(currSum>max){
                max = currSum;
            }

            if(currSum<0){
                currSum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,-2,6,-1,3};
        int n = arr.length;

        System.out.println(maxSubArraySum(arr));


    }
    
}
