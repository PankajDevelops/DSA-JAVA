// package Queues;

public class circularQueueLL {

    public static class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class CircularQueue {

        Node head = null;
        Node tail = null;
        int size = 0;

        // Add a new element to the queue
        public void add(int x) {

            Node temp = new Node(x);

            if (size == 0) {
                head = tail = temp;
                tail.next = head; // Circular connection
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head; // Maintain the circular connection
            }

            size++;
        }

        // Peek the first element of the queue
        public int peek() {

            if (size == 0) {
                System.out.println("Queue is Empty !!!");
                return -1;
            }

            return head.val;
        }

        // Remove the first element from the queue
        public int remove() {

            if (size == 0) {
                System.out.println("Queue is Empty !!!");
                return -1;
            }

            int x = head.val;

            if (size == 1) { // Only one element in the queue
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head; // Maintain the circular connection
            }

            size--;
            return x;
        }

        // Check if the queue is empty
        public boolean isempty() {
            return size == 0;
        }

        // Display the elements in the queue
        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty !!!");
                return;
            }

            Node temp = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        CircularQueue cq = new CircularQueue();

        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.add(6);

        cq.display();
        System.out.println("Size: " + cq.size);
        cq.remove();
        cq.display();
        System.out.println("Size: " + cq.size);
        System.out.println("isEmpty: " + cq.isempty());

        System.out.println(cq.peek());
    }

}
