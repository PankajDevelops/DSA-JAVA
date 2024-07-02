package PriorityQueue.ApnaCollege;
import java.util.*;

public class Classroom {

    public static void main(String[] args) {

        // PriorityQueue<Integer> pq = new PriorityQueue<>();  // 1 3 4 7
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // 7 4 3 1

        pq.add(3); //long(n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" "); //0(1)
            pq.remove(); //o(logn)
        }
        
    }
    
}
