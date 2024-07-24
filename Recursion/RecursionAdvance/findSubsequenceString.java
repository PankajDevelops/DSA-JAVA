package Recursion.RecursionAdvance;

import java.util.ArrayList;

public class findSubsequenceString {

    // with using SPACE of ArrayList 2^n
    public static ArrayList<String> getSubSequence(String str) {

        ArrayList<String> ans = new ArrayList<>();

        if (str.length() == 0) {
            ans.add("");
            return ans;
        }

        char curr = str.charAt(0);

        ArrayList<String> smallAns = getSubSequence(str.substring(1));

        for (String str1 : smallAns) {

            ans.add(str1);
            ans.add(curr + str1);

        }

        return ans;

    }

    // printing subsequence without using extra SPACE

    public static void printSubSequnece(String str, String currAns) {

        if (str.length() == 0) {
            System.out.println(currAns);
            return;
        }

        char ch = str.charAt(0);

        String remString = str.substring(1);

        printSubSequnece(remString, currAns + ch);
        printSubSequnece(remString, currAns);

    }

    public static void main(String[] args) {

        String str = "abc";
        
        // Method : 1
        // ArrayList<String> ans = getSubSequence(str);

        // for (String str1 : ans) {
        // System.out.println(str1 + " ");
        // }

        // Method : 2

        printSubSequnece(str, "");

    }

}
