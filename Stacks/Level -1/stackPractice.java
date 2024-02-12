import java.util.Stack;

public class stackPractice {

    public static void printStackRev(Stack<Integer> st){

        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        printStack(st);
        st.push(top);

    }
    public static void printStack(Stack<Integer> st){

        if(st.size()==0) return;
        int top = st.pop();
        printStack(st);
        System.out.print(top+" ");
        st.push(top);

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
        System.out.println("");
        printStack(st);

        // System.out.println(st);

//push elements of stack in an Array
        // int n = st.size();

        // int[] arr = new int[n];

        // for(int i=n-1; i>=0; i--){
        //     arr[i]=st.pop();
        // }

        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }

    }
    
}
