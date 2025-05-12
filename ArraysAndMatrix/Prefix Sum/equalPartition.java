import java.util.*;
//basic prefix sum template

public class equalPartition {

    public static int totalSum(int arr[], int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=arr[i];

        }
        return sum;
    }

    public static boolean isEqualSumPartition(int arr[], int n){

        int sum = totalSum(arr, n);
        int prefixSum = 0;

        for(int i=0; i<n; i++){
            prefixSum+=arr[i];
            int suffixSum = sum - prefixSum;
            if(suffixSum==prefixSum)
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        System.out.println("Enter array elements");

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal Partition possible: "+ isEqualSumPartition(arr, n));

        
        
    }
    
}
