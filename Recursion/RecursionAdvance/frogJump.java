import java.util.*;
//mustRevise
// package Recursion.RecursionAdvance;

public class frogJump {

public static int minForgJump(int arr[], int n, int idx){

    if(idx==n-1) return 0;

    int opt1 = Math.abs(arr[idx]-arr[idx+1]) + minForgJump(arr,n,idx+1);
    if(idx==n-2) return opt1;

    int opt2 = Math.abs(arr[idx]-arr[idx+2]) + minForgJump(arr,n,idx+2);

    return Math.min(opt1,opt2);
}


    public static void main(String[] args) {
        

        int arr[] = {10,30,40,20};
        int n = arr.length;

        System.out.println(minForgJump(arr, n, 0));

        
        

    }
    
}
