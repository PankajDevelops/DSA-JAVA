// package Level -2;
import java.util.*;
public class balancedBrackets {

    public static void main(String[] args) {
        
        Stack<Character> st = new Stack<>();

        String str = "(())()()";

        for(int i=0;  i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch=='('){
                st.push(ch);
            }
            else{ //ch==')'
            
                if(st.size()==0) System.out.println("false");
                else if(st.peek()=='(') st.pop();
            }
        }

        if(st.size()>0) System.out.println("false");
        else{
            System.out.println("true");
        }
        
         

    }
    
}
