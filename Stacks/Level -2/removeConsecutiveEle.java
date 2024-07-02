// package Stacks.Level -2;

import java.util.*;

public class removeConsecutiveEle {

    public static void main(String[] args) {

        int arr[] = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){

            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);

            else if((arr[i]==st.peek()) && (i==n-1 || arr[i]!=arr[i+1])) st.pop();
         
        }

        System.out.println(st);
        
    }
    
}
