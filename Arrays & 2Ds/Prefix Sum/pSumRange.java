import java.util.*;

public class pSumRange {

    public static void printArray(int arr[], int x){

        for(int i=0; i<x; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println("");

    }

    public static int[] prefixRange(int arr[]){

          int n = arr.length;

         for(int i = 1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
         
        int arr[] = {2,4,1,3,6,5};
        int n = arr.length;

        System.out.println("Original Array");
        printArray(arr, n);

        int ans[] = prefixRange(arr);

        System.out.println("Prefixed SUM Array");
        printArray(arr, n);

        int q = 3;
        System.out.println("Max freq:"+q);

        while(q-->0){

            System.out.println("Enter Range");

            int l = sc.nextInt();
            int r =sc.nextInt();

            int answer = ans[r] - ans[l-1];

            System.out.println("Sum: "+answer);
        }


        


    }
    
}
