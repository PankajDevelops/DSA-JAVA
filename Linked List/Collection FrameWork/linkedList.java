import java.net.SocketTimeoutException;
import java.util.*;

public class linkedList {

    public static void main(String[] args) {
        
        LinkedList <Integer> ll = new LinkedList<>();

        ll.addLast(23);
        ll.addLast(26);
        ll.addLast(28);
        ll.addLast(29);

        System.out.println(ll);

        ll.addFirst(10);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(14);

        System.out.println(ll);
        
        ll.removeLast();
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);

        Collections.sort(ll);
        System.out.println(ll);

        Collections.sort(ll, Collections.reverseOrder());
        System.out.println(ll);

        int idx = ll.get(3);
        System.out.println(idx);

        ll.set(3, 456);
        System.out.println(ll);

        //To search a element in linkedList

        System.out.println(ll.contains(456));
        System.out.println(ll.contains(46));

        //Size of ll
        System.out.println(ll.size());

        //add elemnt to ll
        ll.add(3, 34);
        System.out.println(ll);
        
        
    }
    
}
