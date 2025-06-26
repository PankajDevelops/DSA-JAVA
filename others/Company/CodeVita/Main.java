import java.util.Scanner;

public class Main {

    public static boolean isValid(String s) {
        for (char c : s.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    public static int calculateScore(String s, int a, int b) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                score += a;
            }
            if (s.charAt(i) == '1' && s.charAt(i + 1) == '0') {
                score += b;
            }
        }
        return score;
    }

    public static int hammingDistance(String s1, String s2) {
        int distance = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }

    public static String optimizeString(String s, int a, int b) {
        int n = s.length();
        int onesCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') onesCount++;
        }

        String bestString = s;
        int minScore = calculateScore(s, a, b);
        int minHamming = 0;

        if (onesCount == 0 || onesCount == n) {
            return s;
        }

        String allOnesFirst = "1".repeat(onesCount) + "0".repeat(n - onesCount);
        String allZerosFirst = "0".repeat(n - onesCount) + "1".repeat(onesCount);

        int score1 = calculateScore(allOnesFirst, a, b);
        int score2 = calculateScore(allZerosFirst, a, b);

        int hamming1 = hammingDistance(s, allOnesFirst);
        int hamming2 = hammingDistance(s, allZerosFirst);

        if (score1 < minScore || (score1 == minScore && hamming1 < minHamming)) {
            bestString = allOnesFirst;
            minScore = score1;
            minHamming = hamming1;
        }

        if (score2 < minScore || (score2 == minScore && hamming2 < minHamming)) {
            bestString = allZerosFirst;
            minScore = score2;
            minHamming = hamming2;
        }

        return bestString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (!isValid(s)) {
                System.out.println("INVALID");
                continue;
            }

            String optimizedString = optimizeString(s, a, b);
            System.out.println(hammingDistance(s, optimizedString));
            System.out.println();
        }
        
        sc.close();
    }
}
