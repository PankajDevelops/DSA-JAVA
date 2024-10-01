import java.util.Stack;

public class reverseStack {

        
    public static void pushAtBottom(Stack<Integer> st, int x){

        if(st.size()==0){
            st.push(x);
        return;
    } 
    
    int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);

    }

    public static void printStackRev(Stack<Integer> st){

        if(st.size()==1) return;
        int top = st.pop();
        printStackRev(st);
        pushAtBottom(st,top);

    }

    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        System.out.println(st);
        printStackRev(st);
        System.out.println(st);
        

    }
    
}
