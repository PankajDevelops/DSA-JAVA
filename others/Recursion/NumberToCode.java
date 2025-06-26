import java.util.ArrayList; //MustRevise

public class NumberToCode {

    public static ArrayList<String> getPossibleCodes(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return result;
        }
        generateCodes(str, "", result);
        return result;
    }

    private static void generateCodes(String str, String currentCode, ArrayList<String> result) {
        if (str.isEmpty()) {
            result.add(currentCode);
            return;
        }

        // Single digit decoding
        if (str.length() >= 1) {
            String oneDigit = str.substring(0, 1);
            int oneDigitValue = Integer.parseInt(oneDigit);
            if (oneDigitValue >= 1 && oneDigitValue <= 9) {
                char oneDigitChar = (char) ('a' + oneDigitValue - 1);
                generateCodes(str.substring(1), currentCode + oneDigitChar, result);
            }
        }

        // Two digit decoding
        if (str.length() >= 2) {
            String twoDigits = str.substring(0, 2);
            int twoDigitsValue = Integer.parseInt(twoDigits);
            if (twoDigitsValue >= 10 && twoDigitsValue <= 26) {
                char twoDigitsChar = (char) ('a' + twoDigitsValue - 1);
                generateCodes(str.substring(2), currentCode + twoDigitsChar, result);
            }
        }
    }
    
    public static void main(String[] args) {

        String input = "1125"; 
        ArrayList<String> result = getPossibleCodes(input);
        System.out.println(result);

    }

}