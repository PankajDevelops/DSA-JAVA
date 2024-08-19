package Queues;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Deque;
import java.util.LinkedList;

public class deque {

    public static void main(String[] args) {

        Deque<Integer> dq = new LinkedList<>();

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(2);
        System.out.println(dq);
        dq.addFirst(22);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        // dq.removeAll(dq);
        // System.out.println(dq);

        dq.removeFirstOccurrence(2);
        System.out.println(dq);

    }

}
