

public class intersectionTwoLinkedList {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    //intersection of LL

public static int commonVal(Node head1, Node head2) {
    Node temp1 = head1;
    Node temp2 = head2;
    int count1 = 0;
    int count2 = 0;

    while (temp1 != null) {
        count1++;
        temp1 = temp1.next;
    }

    while (temp2 != null) {
        count2++;
        temp2 = temp2.next;
    }

    // Reset temp1 and temp2 to the beginning of the lists
    temp1 = head1;
    temp2 = head2;

    if (count1 > count2) {
        int steps = count1 - count2;
        for (int i = 0; i < steps; i++) {
            if (temp1 == null) {
                return -1; // Handle the case where there is no intersection
            }
            temp1 = temp1.next;
        }
    } else {
        int steps = count2 - count1;
        for (int i = 0; i < steps; i++) {
            if (temp2 == null) {
                return -1; // Handle the case where there is no intersection
            }
            temp2 = temp2.next;
        }
    }

    while (temp1 != null && temp2 != null) {
        if (temp1 == temp2) {
            return temp1.data; // Return the data value of the common node
        }
        temp1 = temp1.next;
        temp2 = temp2.next;
    }

    return -1; // Handle the case where there is no intersection
}

    

    //display
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Node a = new Node (100);
        Node b = new Node (13);
        Node c = new Node (4);
        Node d = new Node (5);
        Node e = new Node (12);
        Node f = new Node (10);

        Node g = new Node (90);
        Node h = new Node (9);

        a.next=b;//100
        b.next=c;
        c.next=d;
        d.next=e;//5
        e.next=f;

        g.next=h; //90
        h.next=d; //90

        display(a);
        display(g);

        int z = commonVal(a, g);
        System.out.println(z);

        

        

    }
    
}
