package HashMap.HashSet;
import java.util.*;

public class longestCons {
    
    public static int longestConsecutive(int[] arr){

        Set<Integer> st = new HashSet<>();

        for(int num : arr){

            st.add(num);

        }

        int maxStreak = 0;

        for(int num : st){
            if(!st.contains(num-1)){
                int currNum = num;
                int currStreak = 1;

                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }

                maxStreak = Math.max(maxStreak, currStreak);

            }

        }

        return maxStreak;


    }
    
    public static void main(String[] args) {
        
        int[] arr = {99,1,100,4,200,1,2,2,3};

        System.out.println(longestConsecutive(arr));


    }
}
