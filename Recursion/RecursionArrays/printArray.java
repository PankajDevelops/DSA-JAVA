package Recursion.RecursionArrays;

public class printArray {

    public static void printArr(int arr[], int i){

        if(i==arr.length-1) return;
        
        System.out.print(arr[i]+" ");
        printArr(arr,i+1);

    }
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,3,4,5,5,6,6,3,5,5,4,5,35};
        int n = arr.length;

        int i = 0;

        printArr(arr,i);

    }
}
