// package Arrays & 2Ds.Two Pointers;

public class sortEvenOdd {

    static void print(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,7,8,9,5,3,6,7,5,6};
        int n = arr.length;

        print(arr, n);

        int left =  0;
        int right = n-1;

        while(left<right){

            if(arr[left]%2!=0 && arr[right]%2==0){
                swap(arr, left, right);
                left++;
                right--;

            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }

        print(arr, n);


    }
    
}
