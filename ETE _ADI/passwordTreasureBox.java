import java.util.*;

public class passwordTreasureBox {

    public static void main(String[] args) {

        String input = "ABc CDeF GHi";

        String[] words = input.split(" ");

        StringBuilder password = new StringBuilder();

        for (String word : words) {
            int wordValue = calculateWordValue(word);
            // Ensure the word value is between 0 and 9
            if (wordValue < 0) {
                wordValue = 0;
            } else if (wordValue > 9) {
                wordValue = 9;
            }
            password.append(wordValue);
        }

        // Print the password
        System.out.println(password.toString());
    }

    private static int calculateWordValue(String word) {
        
        int wordValue = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                wordValue += (ch - 'A' + 1);
            } else if (Character.isLowerCase(ch)) {
                wordValue -= (ch - 'a' + 1);
            }
        }

        return wordValue;
    }
}
