// package Arrays & 2Ds.Two Pointers;

public class sortSquares {

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    static void reverse(int arr[], int n){
        int s = 0;
        int e = n-1;
        while(s<e){
            swap(arr, s, e);
            s++;
            e--;
        }

    }

    static void print(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,-6};
        int n = arr.length;

        int ans[] = new int[n];
        int k =0;

        int left = 0;
        int right = n-1;

        while(left<=right){

            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
            
            
        }

        print(arr, n);
        reverse(ans, n);
        print(ans, n);
        


    }
    
}
