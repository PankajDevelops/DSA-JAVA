package CoCubes;
import java.util.*;

public class threeProd {
    public static void main (String args[]){

        int k = 60;
        int arr[] = {5,3,20,10,1,4,2};
        int n = arr.length;

        int count = 0;

        Arrays.sort(arr);
        
        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;

            while(left<right){
                int prod = arr[i]*arr[left]*arr[right];
                if(prod==k){
                    count++;
                    left++;
                    right--;
                }
                else if(prod>k){
                    right--;
                }
                else{
                    left++;
                }
            }
        }

        System.out.println(count);

    }
}
