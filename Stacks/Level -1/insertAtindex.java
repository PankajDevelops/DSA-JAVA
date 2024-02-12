import java.util.Stack;

public class insertAtindex{

    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        System.out.println(st);

        //Want to insert (9) at specific index...

        int idx = 2;
        int  n = 9;

        Stack<Integer> rt = new Stack<>();

        while(st.size()>2){
            rt.push(st.pop());
        }

        rt.push(n);

        while(rt.size()>0){
            st.push(rt.pop());

        }

        System.out.println(st);

        

    }
    
}
