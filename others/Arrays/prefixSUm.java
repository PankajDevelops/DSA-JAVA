package DSA.Arrays;

import java.util.*;

public class prefixSUm {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8};

        for(int num:arr){
            System.out.print(num+" ");
        }

        System.out.println("");

        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }

        for(int num:arr){
            System.out.print(num+" ");
        }
        

    }
    
}
