package Recursion.RecursionArrays;

public class linearSearch {

    public static boolean linearSearchMethod(int arr[], int k, int i){

        if(i>=arr.length) return false;
        if(arr[i]==k) return true;

        return linearSearchMethod(arr, k, i+1);

    }

    public static int linearSearchIndex(int arr[], int k, int i){

        if(i>=arr.length) return -1;
        if(arr[i]==k) return i;

        return linearSearchIndex(arr, k, i+1);

    }
    public static void main(String[] args) {
        
        int arr[] = {1,3,5,7,4,6,8,42,223,543,4534,243};
        int k = 3;
        int i = 0;

        boolean ans = linearSearchMethod(arr,k,i);
        int ansIdx = linearSearchIndex(arr,k,i);

        System.out.println(ans);
        System.out.println(ansIdx);

    }
    
}
