// package ETE_ADI;

import java.util.*;

public class nonRepCharStack {

    public static void main(String[] args) {

        String str = "dfbbbfgaaaahb";
        char pop = '*';

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (st.isEmpty()) {
                st.push(ch);
            } 
            else if (st.peek() != ch && pop != ch) {
                st.push(ch);
                pop = '*';
            } else if (st.peek() == ch) {
                pop = st.pop();
            }
        }

        String w = "";

        while (!st.isEmpty()) {
            w = st.peek() + w;
            st.pop();
        }

        System.out.println(w);

    }

}
