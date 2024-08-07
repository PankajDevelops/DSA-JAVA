package Recursion.RecursionOnStrings;

public class permutationOfString {

    public static void main(String[] args) {

        String str = "abc";
        printPremutation(str, "");

    }

    public static void printPremutation(String str, String ans) {

        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            String rem = left + right;

            printPremutation(rem, ch + ans);
            
        }

    }

}
