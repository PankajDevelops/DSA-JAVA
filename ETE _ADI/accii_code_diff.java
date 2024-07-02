
// package ETE _ADI;
import java.util.*;

public class accii_code_diff {

    public static void main(String[] args) {

        String str = "A12$";

        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));

        for (int i = 0; i < str.length() - 1; i++) {

            int diff = str.charAt(i + 1) - str.charAt(i);

            sb.append(diff);
            sb.append(str.charAt(i + 1));

        }

        System.out.println(sb.toString());

    }

}
