import java.util.*;

public class ayyarCopyClone{

    public static void printArray(int arr[], int x){

        for(int i=0; i<x; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println("");

    }

    public static void main(String[] args) {

        //original array
        int[] arr = {9,12,8,14,16};
        System.out.println("Original Array");
        printArray(arr, 05);

        //copied array
        int[] brr1 = arr;
        System.out.println("Copied Array");
        printArray(brr1, 5);

        //changing value
        brr1[0]=31;
        brr1[1]=32;
        System.out.println("brr modified Array");
        printArray(brr1, 5);
        System.out.println("arr unmodified Array");
        printArray(arr, 5); 
        //due to refering same address (orginal array's value changed) reference

        //cloning array
        int brr2[] = arr.clone();

        brr2[0]=99;
        brr2[1]=-103;
        System.out.println("arr unmodified Array");
        printArray(arr, 5);
        System.out.println("brr2 modified Array");
        printArray(brr2, 5);


        //copyOf Method
        int[] crr1 = Arrays.copyOf(brr2,brr2.length);
        System.out.println("crr2 copyOf method (origonal value not changed)");
        printArray(crr1, 2); //we can put upto any under length

        //copyOfRange
        int[] crr2 = Arrays.copyOfRange(brr2,2,4); //just like substring methd in string
        printArray(crr2, crr2.length);




    }
    
}
