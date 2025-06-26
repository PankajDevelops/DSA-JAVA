package Matrices;

public class printAllSubarray {

    public static void print(int arr[], int x, int y){

        for(int i=x; i<=y; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        
        int arr[] = {3,4,-7,1,3,3,1,-4};

        int n = arr.length;

        int k = 7;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
               sum += arr[j]; 
               if(sum == k){
                print(arr, i, j);
            }
        }

    }
    
  }
}