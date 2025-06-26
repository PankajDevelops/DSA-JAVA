package LinkedList;

import java.util.*;

public class Main{

    public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
        
    }

    public static void main(String[] args) {
        
        
        int arr[] = {2,3,4,5};
        int n = arr.length;

        Node num = new Node(arr[0]);
        Node x = num;

        int i = 1;

        while(i<n){
            Node z = new Node(arr[i++]);
            x.next = z;
            x = z;
        }

        while(num!=null){
            System.out.print(num.data+" ");
            num = num.next;
        }

    }

}