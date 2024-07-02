// package Linked List.LL Advanced;
public class doublyLL {

    
    public static class Node{
        int val;
        Node next;
        Node prev;
        
        Node(int val){
            this.val = val;
        }
    }


    //dispaly LL
    
    public void displayLL(Node head){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println("");
    }

    //printing LL from starts
    public static void printLL(Node head){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println("");
    }
    //printing LL from end
    public static void printRL(Node tail){
        Node temp = tail;

        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println("");
    }

    //print ll form any Ndode
     public static void displayR(Node random){
        Node temp = random;

        while(temp.prev!=null){
            temp = temp.prev;
        }

        printLL(temp);
        
     }

     //insert At Head

     public static Node insertAtHead(Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;

        return head;
     }

     //insert at tail

     public static Node insertAtTail(Node head, int x){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
        

        return head;
     }

     //insert at index

     public static void insertAtIndex(Node head, int idx, int x){

        Node s = head;

        for(int i=1; i<idx; i++){
            s=s.next;
        }

        Node r = s.next;
        Node t = new Node(x);

        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = s;

     }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3); 
        Node d = new Node(4);
        Node e = new Node(5);

         a.prev = null;
        a.next = b;
         b.prev = a;
        b.next = c;
         c.prev = b;
        c.next = d;
         d.prev = c;
        d.next = e;
         e.prev = d;
        e.next = null;

        displayR(c);
        insertAtHead(a, 89);
        displayR(c);
        insertAtTail(e, 908);
        displayR(c);
        insertAtIndex(a, 4, 560);
        displayR(c);



        
    }
    
}
