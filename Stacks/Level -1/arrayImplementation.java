public class arrayImplementation {

    public static class Stack {

        private int[] arr = new int[4];
        private int idx = 0;

        void push(int x) {
            if (isFull() == true) {
                System.out.println("Stack Full !!!");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack Empty !!!");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack Empty !!!");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;

        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            if (idx == 0) {
                return true;
            }
            return false;
        }

        boolean isFull() {
            if (idx == arr.length) {
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        System.out.println("");
        st.push(7);
        st.push(9);
        System.out.println(st.isFull());
        st.push(100);

        
    }

}
