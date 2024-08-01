package Queues;

public class linkedListImplementation {

    public static class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class queue {

        Node head = null;
        Node tail = null;

        int size = 0;

        public void add(int x) {

            Node temp = new Node(x);

            if (size == 0) {
                head = tail = temp;
            } else {

                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int peek() {

            if (size == 0) {
                System.out.println("Queue is Empty !!!");
                return -1;
            }

            return head.val;
        }

        public int remove() {

            if (size == 0) {
                System.out.println("Queue is Empty !!!");
                return -1;
            }

            int x = head.val;
            head = head.next;
            size--;

            return x;

        }

        public boolean isempty() {

            if (size == 0) {
                return true;
            }
            return false;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty !!!");
                return;
            }

            Node temp = head;

            while (temp!= null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }

        }

    }

    public static void main(String[] args) {

        queue q = new queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        q.display();
        System.out.println("Size: " + q.size);
        q.remove();
        q.display();
        System.out.println("Size: " + q.size);
        System.out.println("isEmpty: " + q.isempty());

        System.out.println(q.peek());

    }

}
