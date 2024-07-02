package Recursion.RecursionAdvance;

public class sumOfSubsets {

    public static void printSumOfSubset(int arr[], int idx, int sum){

        int n = arr.length;

        if(idx>= n){
            System.out.print(sum+" ");
            return;
        } 
        
        printSumOfSubset(arr, idx+1, sum + arr[idx]);
        printSumOfSubset(arr, idx+1, sum);

    }

    public static void main(String[] args) {
        
        int arr[] = {4,5,2};
        int idx = 0;
        int sum = 0 ;

        printSumOfSubset(arr,idx,sum);

    }
    
}
