package Recursion.RecursionAdvance;

public class sumOfSubsets {

    public static void printSumOfSubset(int arr[], int idx, int sum){

        int n = arr.length;

        if(idx>= n){
            System.out.println(sum+" ");
            return;
        } 
        
        printSumOfSubset(arr, idx+1, sum + arr[idx]);
        printSumOfSubset(arr, idx+1, sum);

    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,5};
        int idx = 0;
        int sum = 0 ;

        printSumOfSubset(arr,idx,sum);

    }
    
}
