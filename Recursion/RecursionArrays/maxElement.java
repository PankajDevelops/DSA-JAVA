package Recursion.RecursionArrays;

import java.io.OutputStream;

public class maxElement {


    static int maxEle(int arr[], int i){

        
        if(i==arr.length-1){ 
            
            return arr[i];
        }
        
        int max = maxEle(arr, i+1);
        
        return Math.max(max, arr[i]);

    }

    static int sumOfArr(int arr[], int idx){

        // if(idx>=arr.length){
        //     return 0;
        // }

        if(idx==arr.length-1){
            return arr[idx];
        }

        return sumOfArr(arr, idx+1)+arr[idx];

    }

    public static void main(String[] args) {
        
        int arr[] =  {1,2,3,5};

        int i = 0;
        int ans = maxEle(arr,i);

        System.out.println(ans);

        int sum = sumOfArr(arr, i);
        int idx= 0 ;

        System.out.println(sum);

    }
    
}
