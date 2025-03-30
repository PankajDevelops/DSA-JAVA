// package Arrays & 2Ds.Two Pointers;
//two pointer starts

public class sortZeroOne {

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
        
        int[] arr = {1,0,0,0,1,1,1,1,0,1,0,1,0,1,0,0,1};
        
        int n = arr.length;

//Method : 1 using extra space
        int count = 0;

        for(int i=0; i<n; i++){
            if(arr[i]==0){
                count++;
            }
        }

        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            if(i<count){
                ans[i]=0;
            }
            else{
                ans[i]=1;
            }
        }

        print(arr, n);
        print(ans, n);

//Method : 2 Without using extra space
        int left = 0;
        int right = n-1;

        while(left<right){

            if(arr[left]==1 && arr[right]==0){
            swap(arr, left, right);
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        
        }

        print(arr, n);

    }
    
}
