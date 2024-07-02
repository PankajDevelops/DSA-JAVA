// package ETE _ADI;

public class odd_even_char {

    public static void main(String[] args) {

        String str = "ABcdfg";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (i % 2 == 0) {
                sb.append((char) (ch + 1));
            }

            else {
                sb.append((char) (ch - 1));
            }

        }

        System.out.println(sb.toString());

    }

}
