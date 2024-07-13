
// package Strings.Lev-2;
/* 
3. Longest Substring Without Repeating Characters

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
import java.util.*;

public class longSubstring {

   public static void main(String[] args) {

      String str = "abcabcbb";

      int left = 0;
      int right = 0;

      int maxNum = 0;


      boolean[] arr = new boolean[256];

      while (right < str.length()) {

         while (arr[str.charAt(right)]) {
            arr[str.charAt(left)] = false;
            left++;
         }

         arr[str.charAt(right)] = true;
         maxNum = Math.max(maxNum, right - left + 1);
         right++;

      }

      System.out.println(maxNum);
   }

}
