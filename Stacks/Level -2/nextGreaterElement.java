// package Stacks.Level -2;

import java.util.Stack;

public class nextGreaterElement {

    public static void main(String[] args) {

        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };
        int n = arr.length;

        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        ans[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = st.peek();

            st.push(arr[i]);
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");

        for (int num : ans) {
            System.out.print(num + " ");
        }

    }

}
