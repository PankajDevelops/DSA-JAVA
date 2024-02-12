
public class linkedListStacks {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class Stack{

        private Node head = null;
        private int size = 0;

        void push(int x){

            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;

        }

        // void displayRev(){
        //     Node temp = head;
        //     while(temp!=null){
        //         System.out.print(temp.val+" ");
        //         temp = temp.next;
        //     }
        //     System.out.println("");
        // }

        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }

        void display(){
            displayRec(head);
            System.out.println("");
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }

        int pop(){

            if(head==null){
                System.out.println("Stack Empty !!!");
                return -1;
            }

            int x = head.val;
            head = head.next;
            return x;
        }

        int peek(){

             if(head==null){
                System.out.println("Stack Empty !!!");
                return -1;
            }
            int x = head.val;
            return x;

        }
    }


    public static void main(String[] args) {
        
        Stack st = new Stack();

        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());

        st.push(7);
        st.push(9);


    }
    
}
