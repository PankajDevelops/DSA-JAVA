package Sorting.QuesSet;

/*Given an integer array arr, move all O's to the end of it while maintaining the relative order of
the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Input:
0 5 0 3 4 2

Output:
5 3 4 2 0 0 */

public class moveZeroesEnd {

    public static void swap(int brr[], int a, int b) {
        int temp = brr[a];
        brr[a] = brr[b];
        brr[b] = temp;
    }

    public static void print(int brr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {0,5,0,3,4,2};
        int n = arr.length;

        // int count = 0;

        // for(int i=0; i<n; i++){
        //     if(arr[i]==0) count++;
        // }

        // for(int i=0; i<n; i++){
        //     if(arr[i]!=0) System.out.print(arr[i]+" ");
        // }

        // for(int i=0; i<count; i++){
        //     System.out.print(0+" ");
        // }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    swap(arr, j, j+1);
                }
            }
        }

        // int n = arr.length;

        // int j = 0;

        // for (int i = 0; i < n; i++) {

        //     if (arr[j] == 0 && arr[i] != 0) {
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //     }

        //     if (arr[j] != 0)
        //         j++;
        // }

        print(arr, n);


    }
    
}
