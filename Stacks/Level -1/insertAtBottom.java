import java.util.Stack;

public class insertAtBottom {

    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        System.out.println(st);

        //Want to inser (9) at bottom...

        Stack<Integer> rt = new Stack<>();

        int n = 9;

        while(st.size()>0){
            rt.push(st.pop());
        }
        
        rt.push(n);

        System.out.println(rt);

        while(rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println(st);



    }
    
}
