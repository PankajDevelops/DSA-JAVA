// package ETE _ADI;

import java.util.*;

public class non_overlapping {

    public static void main(String[] args) {
        
        // int[][] interval = {{1,2},{2,3},{3,4},{1,3}};
        int[][] interval = {{1,2},{2,3}};
                        //start //end

        Arrays.sort(interval,Comparator.comparingInt(o->o[1]));

        int count = 0;

        int currAct = interval[1][0];
        count++;

        for(int i=1; i<interval.length; i++){
            if(interval[i][0]>=currAct){
                count++;
                currAct = interval[i][1];
            }
        }

        System.out.println(interval.length-count);


    }
    
}
