package Arrays;
import java.util.*;

public class removeCons {

    public static void main(String[] args) {
        

        int arr[] = {1,2,2,3,10,10,10,4,4,4,5,7,7,7,2};

        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for(int i=0; i<n; i++){

            if(st.isEmpty() || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            
            else if((st.peek()==arr[i]) && (i==n-1 || arr[i]!=arr[i+1])) st.pop();
        }

        System.out.println(st);

    }

    
}
