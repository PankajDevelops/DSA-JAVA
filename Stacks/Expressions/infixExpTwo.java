
// package Stacks.Expressions;
import java.util.*;

public class infixExpTwo {

    public static void main(String[] args) {

        String str = "9-(5+3)*4/6";

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        int n = str.length();

        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                val.push(ch - '0');
            }
            else if(op.isEmpty() || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while (op.peek()!='(') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-')val.add(v1-v2);
                    if(op.peek()=='+')val.add(v1+v2);
                    if(op.peek()=='*')val.add(v1*v2);
                    if(op.peek()=='/')val.add(v1/v2);

                    op.pop();
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-')val.add(v1-v2);
                    if(op.peek()=='+')val.add(v1+v2);
                    if(op.peek()=='*')val.add(v1*v2);
                    if(op.peek()=='/')val.add(v1/v2);

                    op.pop();
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='*')val.add(v1*v2);
                    if(op.peek()=='/')val.add(v1/v2);
                    
                    op.pop();
                    op.push(ch);

                   }
                    else{
                        op.push(ch);
                   }
                }
            }

        }

        while(val.size()>1){

                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-')val.add(v1-v2);
                    if(op.peek()=='+')val.add(v1+v2);
                    if(op.peek()=='*')val.add(v1*v2);
                    if(op.peek()=='/')val.add(v1/v2);
                    op.pop();

        }

        System.out.println(val.peek());

    }

}
