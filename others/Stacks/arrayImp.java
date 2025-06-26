package Stacks;
import java.util.*;


public class arrayImp {

    public static class Stack{

        int arr[] = new int[4];
        int idx = 0;

        void push(int val){

            if(isFull()){
                System.out.println("Stack is Full !!!");
                return;
            }

            arr[idx++] = val;
        }

        int pop(){

            if(isEmpty()){
                System.out.println("Stack is Empty !!!");
                return -1;
            }

            int val = arr[idx-1] = 0;
            idx--;
            return val;

        }

        int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty !!!");
                return -1;
            }

            int val = arr[idx-1];
            return val;
        }

        boolean isEmpty(){
            return idx==0;
        }

        int size(int idx){
            return idx;
        }

        boolean isFull(){
            return idx==arr.length;
        }

        void display(){
            for(int i=0; i<idx; i++){
                System.out.print(arr[i]+" ");
            }
        }


    }

    public static void main(String[] args) {
        
        Stack st = new Stack();

        st.push(5);
        st.push(3);
        st.push(1);
        
        st.display();
        System.out.println("");

        st.pop();
        st.display();
        System.out.println("");
        st.push(87);
        st.display();
        System.out.println("");
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());



    }
    
}
