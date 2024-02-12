import java.util.*;

public class isomorphicStrings {

    public static void main(String[] args) {

        String str1 = "abbc";
        String str2 = "ngfh";

        Map<Character, Character> mp = new HashMap<>();
        Set<Character> st = new HashSet<>();
        boolean isIsomorphic = true;

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (mp.containsKey(ch1)) {
                if (mp.get(ch1) != ch2) {
                    isIsomorphic = false;
                    break;
                }
            } else {
                if (st.contains(ch2)) {
                    isIsomorphic = false;
                    break;
                }
                mp.put(ch1, ch2);
                st.add(ch2);
            }
        }

        if (isIsomorphic) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
