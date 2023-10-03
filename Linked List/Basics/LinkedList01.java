class LinkedList01{

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
//length of ll
    public static int length(Node head){
        int count = 0;

        while(head!=null){
            count++;
            head=head.next;

        }
        return count;
    }

    public static void main(String[] args) {
        
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(10);
        Node f = new Node(12);
         
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

       /*  System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);*/

        Node temp = a;
        /*for(int i=1; i<=5; i++){
            temp = temp.next;
            System.out.print(temp.data+ " ");
        }*/

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
System.out.println("");
        System.out.println(length(a));

    }
}