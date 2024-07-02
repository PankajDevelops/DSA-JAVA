// package Arrays & 2Ds.Arrays Lev -1;

public class lastOccur {

    public static void printArray(int arr[], int x){

        for(int i=0; i<x; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println("");

    }

    public static void main(String[] args) {

        int[] arr = {1,2,4,6,4,8,9,4,3,6,4, 7, 9, 4, 7, 5, 7};
                //   0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
                printArray(arr, arr.length);

                int val = 4;
                int idx = 0;

                for(int i =0; i<arr.length; i++){
                    if(arr[i]==val){
                        if(i>idx){
                            idx = i;

                        }
                    }
                }
                System.out.println("index is :" +" "+idx);
        
    }
    
}
