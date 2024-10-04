import java.util.*;

public class infixToPostfix {

    public static void main(String[] args) {

        String str = "9-(5+3)*4/6"; 
        // String str = "a+b*(c^d-e)^(f+g*h)-i";

        Stack<String> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        int n = str.length();

        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                String temp = "" + ch;
                s1.push(temp);
            } else if (s2.isEmpty() || ch == '(' || s2.peek() == '(') {
                s2.push(ch);
            } else if (ch == ')') {
                while (s2.peek() != '(') {
                    String c2 = s1.pop();
                    String c1 = s1.pop();
                    char o = s2.pop();

                    String t = c1 + c2 + o;
                    s1.push(t);
                }
                s2.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    String c2 = s1.pop();
                    String c1 = s1.pop();
                    char o = s2.pop();

                    String t = c1 + c2 + o;
                    s1.push(t);
                    s2.push(ch);
                }

                if (ch == '*' || ch == '/') {
                    if (s2.peek() == '*' || s2.peek() == '/') {
                        String c2 = s1.pop();
                        String c1 = s1.pop();
                        char o = s2.pop();

                        String t = c1 + c2 + o;
                        s1.push(t);
                        s2.push(ch);
                    } else {
                        s2.push(ch);
                    }

                }

            }

        }

        while (s1.size() > 1) {
            String c2 = s1.pop();
            String c1 = s1.pop();
            char o = s2.pop();

            String t = c1 + c2 + o;
            s1.push(t);
        }

        System.out.println(s1.peek());

    }

}
