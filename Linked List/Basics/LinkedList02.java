public class LinkedList02 {

    //LL printing
    public static void display(Node head){

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    //Display using Recurrsion
    public static void displayRR(Node head){
        if(head==null)return;
        System.out.print(head.data+" ");
        displayRR(head.next);
        
    }

    //reverse Using recc
    public static void reverseLR(Node head){
        if(head==null)return;
        reverseLR(head.next);
        System.out.print(head.data+" ");
    }

    //Insert at end (with HEAD)
public static void insertAtEnds(Node head, int val){
    Node temp = new Node(val);
    Node t = head;
    while(t.next!=null){
        t = t.next;
    }
    t.next=temp;
}

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

public static void main(String[] args) {

    Node a = new Node(5);
    Node b = new Node(15);
    Node c = new Node(25);
    Node d = new Node(35);
    Node e = new Node(45);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

//LL Printing
    display(a);
    System.out.println("");
//USing reccusrion
displayRR(a);

 //Reverse using recc
reverseLR(a);
System.out.println("");
insertAtEnds(a, 87);
display(a);
   
   
    
}
 
}

    

