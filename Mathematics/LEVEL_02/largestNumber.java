import java.util.*;
public class largestNumber {

/*179. Largest Number
Given a list of non-negative integers nums, arrange them such that they form the largest number and 
return it.
Input: nums = [3,30,34,5,9]
Output: "9534330" */
 
    public static void main(String[] args) {
        
        int nums[] = {3,30,34,5,9};

        String arr[] = new String[nums.length];

        int n = arr.length;

        for(int i=0; i<n; i++){
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));

        boolean isAllZero = true;

        for(String s:arr){
            if(!s.equals("0")){
                isAllZero = false;
                break;
            }
        }

        if(isAllZero){
            System.out.println("0");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for(String s:arr){
            sb.append(s);
        }

        System.out.println(sb.toString());


    }
    
}
