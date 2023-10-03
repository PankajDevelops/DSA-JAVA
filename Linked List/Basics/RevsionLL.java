public class RevsionLL {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

//LinkedList Backend code
public static class linkedList{

    Node head= null;
    Node tail=null;
    int size=0;

    void insertAtEnd(int val){
        Node temp = new Node(val);

        if(head==null){
            head=temp;
        }
        else{
            tail.next=temp;
        }
        tail=temp;
        size++;


    }

//insertAtIndexAccordingly

void insertAt(int idx, int val){
    Node t = new Node(val);
    Node temp = head;

    for(int i=0;i<=idx-1; i++){
        temp=temp.next;    }
    t.next=temp.next;
    temp.next=t;
    size++;

}

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");

    }

}


    public static void main(String[] args) {
        
  linkedList ll = new linkedList();

  ll.insertAtEnd(5);
  ll.insertAtEnd(6);
  ll.display();




       
        


    }
    
}
