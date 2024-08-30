package Strings;

import java.util.*;


class longestSubstringWRepeat{

/*Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. */
    public static void main(String[] args) {

        String str = "abcabcbb";

        Set<Character> st = new HashSet<>();

        int l = 0;
        int r = 0;

        int result = 0;

        while(r<str.length()){
            char ch = str.charAt(r);
            if(!st.contains(ch)){
                st.add(ch);
                result = Math.max(result, st.size());
                r++;
            }
            else{
                st.remove(str.charAt(l));
                l++;
            }
        }

        System.out.println(result);
        


    }
}