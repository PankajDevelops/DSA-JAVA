// package Queues.Basics;

import java.util.*;

public class queue_01 {

    public static void main(String[] args) {

        //declaration
        Queue<Integer> x = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

       System.out.println("Size: " +q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println("Size: "+q.size());

        //for top
        System.out.println(q.element());
        System.out.println(q.peek());

        for(int num : q){
            System.out.print(num+" ");
        }

    }

}
