import java.util.*;

public class highestLowestElement {

    public static void printMinMax(int arr[], int n){

        int minEle = 0;
        int maxEle = 0;

        int minFreq = n;
        int maxFreq = 0;

        

        boolean visited[] = new boolean[n];

        for(int i=0; i<n; i++){

            if (visited[i] == true)
                continue;

            int count = 1;

            for(int j = i+1; j<n; j++){

                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }

            if(count>maxFreq){
                maxEle = arr[i];
                maxFreq = count;
            }
            if(count<minFreq){
                minEle = arr[i];
                minFreq = count;
            }

        
        }
        
        System.out.println("The highest frequency element is: " + maxEle+" \ncount: "+maxFreq);
        System.out.println("The lowest frequency element is: " + minEle+" \ncount: "+minFreq);
    }

    

    public static void main(String[] args) {
        
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;

        printMinMax(arr,n);


        

        



    }
    
}
