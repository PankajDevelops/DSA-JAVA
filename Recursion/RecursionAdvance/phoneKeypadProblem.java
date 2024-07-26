package Recursion.RecursionAdvance;

public class phoneKeypadProblem {

    public static void combination(String dig, String keyPad[], String ans) {

        if (dig.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        int currNum = dig.charAt(0) - '0';
        String currChoices = keyPad[currNum];

        for (int i = 0; i < currChoices.length(); i++) {
            combination(dig.substring(1), keyPad, ans + currChoices.charAt(i));
        }

    }

    public static void main(String[] args) {

        String str = "253";

        String keyPad[] = {"","","abc","def","ghi","jkl","mno","qprs","tuv","wxyz"};
                        //  0   1   2     3     4     5     6     7     8      9

        combination(str,keyPad,"");

        
    }
    
}
