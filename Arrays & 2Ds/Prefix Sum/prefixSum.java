// package Arrays & 2Ds.Prefix Sum;

public class prefixSum {

    public static void printArray(int arr[], int x){

        for(int i=0; i<x; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        
        int arr[] = {2,3,5,6,7,8,9};
        int n = arr.length;

        int ans[] = new int[n];

        System.out.println("Original Array");
        printArray(arr, n);

        
        //with space just use
        // ans[0] = arr[0];
        // ans[i]= ans[i-1] + arr[i];

        for(int i = 1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
 
        System.out.println("Prefixed SUM Array");
        printArray(arr, n);

    }
    
}
