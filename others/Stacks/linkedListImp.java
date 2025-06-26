package Stacks;
import java.util.*;


public class linkedListImp {

    public static class Node{

        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static class Stack{

        private Node head = null;
        int size = 0;

        void push(int val){

            Node temp = new Node(val);
            temp.next = head;
            head = temp;

            size++;
        }

        int pop(){

            if(isEmpty()){
                System.out.println("Stack is Empty !!!");
                return -1;
            }

            int val = head.val;
            head = head.next;
            size--;
            return val;

        }

        int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty !!!");
                return -1;
            }

             int val = head.val;
            return val;
        }

        boolean isEmpty(){
            return size==0;
        }

        int size(){
            return size;
        }

        void display(){

            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }


    }

    public static void main(String[] args) {
        
        Stack st = new Stack();

        st.push(34);
        st.push(35);
        st.push(36);
        st.push(37);

        st.display();
        System.out.println("");

        System.out.println(st.pop());
        System.out.println(st.peek());
        st.display();




    }
    
}
