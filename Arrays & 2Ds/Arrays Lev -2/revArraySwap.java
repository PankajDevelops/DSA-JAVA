// package Arrays & 2Ds.Arrays Lev -2;

public class revArraySwap {

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

    public static void reverseArray02(int arr[], int n){

        for(int i=n-1; i>=0; i--){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printArr(int arr[], int n){

        for(int i=0; i<n; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1,4,6,9,3,5,8,6,4};

        printArr(arr, arr.length);
        reverseArray(arr, arr.length);
        printArr(arr, arr.length);
        reverseArray02(arr, arr.length);
        
    }
    
}
