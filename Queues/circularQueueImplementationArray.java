// package Queues;

public class circularQueueImplementationArray {

    public static class Cqueue {

        int front = -1;
        int rear = -1;

        int size = 0;

        int arr[] = new int[10];

        public void add(int val) {

            if (size == arr.length) {
                System.out.println("Queue is full !!!");
                return;
            } else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            } else if (rear < arr.length - 1) {
                arr[++rear] = val;
            } else if (rear == arr.length - 1) {
                arr[0] = val;
                rear = 0;
            }

            size++;

        }

        public int remove() {

            if (size == 0) {
                System.out.println("Cqueue is Empty !!!");
                return -1;
            }

            else {
                int x = arr[front];
                if (front == arr.length - 1) {
                    front = 0;
                } else {
                    front++;
                }
                size--;
                return x;
            }
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Cqueue is Empty !!!");
                return -1;
            }

            return arr[front];
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
            } else if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = front; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }

        }
    }

    public static void main(String[] args) {

        Cqueue q = new Cqueue();

        q.display();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.display();
        q.remove();
        System.out.println("");
        q.display();
        q.add(8);
        System.out.println("");
        q.display();

    }

}
