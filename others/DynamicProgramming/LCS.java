

import java.util.*;

public class LCS{

    public static void main(String[] args) {
        
        String s1 = "abcdgh";
        String s2 = "abedfhr";

        String ans = "";

        int n = s1.length();
        int m = s2.length();

        int count = 0;

        for(int i=0; i<n; i++){
            char c = s1.charAt(i);
            String temp = s2.substring(i);
            if(temp.contains(String.valueOf(c))){
                count++;
            }
        }

        System.out.println(count);

    }

}