package DSA.Arrays;

import java.util.*;

public class spiralMatrix{

    public static void printMatrix(int arr[][]){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
            {17,18,19,20}
        };

        printMatrix(arr);

        

    }
}