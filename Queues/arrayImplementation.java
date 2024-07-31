package Queues;

import java.util.*;

public class arrayImplementation {

    public static class queueA {

        int f = -1;
        int r = -1;

        int arr[] = new int[5];

        int size = 0;

        // ----------------------------------to add val-------------
        public void add(int val) {

            if (r == arr.length - 1) {
                System.out.println("Queue is Full !!!");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = val;
            } else {

                arr[++r] = val;

            }

            size++;
        }

        // --------------------------------to remove---------------
        public int remove() {

            if (size == 0) {
                System.out.println("Queue is Full !!!");
                return -1;
            }

            int x = arr[f];
            f++;

            size--;

            return x;
        }

        // --------------------------------to peek---------------
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty !!!");
                return -1;
            }
            return arr[f];
        }

        // --------------------------------isEmpty---------------
        public boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }

        // ----------------------------------toDisplay------------
        public void display() {

            if (size == 0) {
                System.out.println("Queue is Empty !!!");
                return;
            } else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println("");
            }

        }

    }

    public static void main(String[] args) {

        queueA q = new queueA();
        q.display();

        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        q.display();
        q.remove();
        q.display();

        System.out.println(q.peek());
        System.out.println(q.size);

    }

}
