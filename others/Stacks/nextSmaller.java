// package Stacks;
import java.util.*;

public class nextSmaller {

    public static int[]NSE (int arr[]){
        int n = arr.length;
        int ans[] = new int [n];
        Stack<Integer> st = new Stack<>();
        ans[n-1] = -1;
        st.push(n-1);

        for(int i=n-2; i>=0; i--){

            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(i);
        }

        return ans;
    }

    public static int[]PSE (int arr[]){
        int n = arr.length;
        int ans[] = new int [n];
        Stack<Integer> st = new Stack<>();

        ans[0] = -1;
        st.push(0);

        for(int i=1; i<n; i++){

            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        
        int arr[] = {5,2,4,6,3,5};
        int n = arr.length;

        int ans1[] = NSE(arr);
        System.out.println("NSE");
       for(int num:ans1){
        System.out.print(num+" ");b
       }
System.out.println("");
       int ans2[] = PSE(arr);
        System.out.println("PSE");
       for(int num:ans2){
        System.out.print(num+" ");
       }

    }
    
}
