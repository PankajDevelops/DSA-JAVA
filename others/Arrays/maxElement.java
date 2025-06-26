package Arrays;

import java.util.*;

public class maxElement {

    public static void main(String[] args) {
        
        int arr[] = {1,1,2,2,1};
        int n = arr.length;

        int maxCount = 0;
        int maxOccur = 0;

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>maxCount){
                    maxCount = count;
                    maxOccur = arr[i];
                }
            }
        }

        System.out.println(maxOccur+" "+maxCount);

    }
    
}
