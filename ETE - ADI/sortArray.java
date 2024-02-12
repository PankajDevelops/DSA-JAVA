// package ETE - ADI;

import java.util.*;

public class sortArray {

    public static void swap(int arr[], int a, int b){
        int temp = arr[a] ;
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverseArray(int [] arr, int n){
        
        int start = 0;
        int end = n-1;

        while(start<=end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void printArray(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        
        int arr[] = {2,6,4,8,2,6};
        int n = arr.length;
        int brr[] = Arrays.copyOf(arr, n);
        int ans[] = new int[n];

        Arrays.sort(brr);
        reverseArray(brr, n);

        int k  = 0;
        boolean visited[] = new boolean[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if (brr[i]==arr[j] && !visited[j]) {
                    ans[i] = j;
                    visited[j] = true;
                    break;
                }

            }
        }

        printArray(ans);

        



    }
    
}
