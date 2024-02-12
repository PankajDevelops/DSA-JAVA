// package Arrays & 2Ds.Arrays Lev -2;

public class rotateArray {

    public static void printArr(int arr[], int n){

        for(int i=0; i<n; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] rotateKth(int arr[], int n, int k){

        k = k%n;

        int[] ans = new int[n];
        int j = 0;

        for(int i=n-k; i<n; i++){
          ans[j++]=arr[i];
        }

        for(int i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }

        return ans;

    }

    public static void swap(int arr[], int a, int b){
        int temp = arr[a] ;
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverseArray(int [] arr, int start, int end){

        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void printRotate(int arr[], int n, int k){

        k = k%n;

        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
        printArr(arr, n);

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 3;

        printArr(arr,n);

        //with extra space
       int[] ans = rotateKth(arr, n, k);
        printArr(ans, n);

        //without using extra space
        printRotate(arr,n, 3);

       
    }
         

    }
    

