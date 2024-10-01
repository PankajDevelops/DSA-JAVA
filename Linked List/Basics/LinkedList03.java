public class LinkedList03 {

//CommonLinkedListFunction
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

//LinkedList Backend Code
    public static class LinkedList{

        Node head=null;
        Node tail=null;
        int size = 0;
//-------------------------------
// Insertation at tail
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
//----------------------------------
//Insertation at head
       void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
            
        }
        size++;
        
       }

//Insert at INDEX ACCORDINGLY
       void insertAt(int idx, int val){
        
        Node t = new Node(val);
        Node temp = head;
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        else if(idx==0){
            insertAtHead(val);
        }
        else if(idx<0 || idx>size){
            System.out.println("wrong index");
            return;

        }

        for(int i=0; i<idx; i++){
            temp = temp.next;
        }

        t.next=temp.next;
        temp.next=t;
        size++;

       }

//get value at index
int getAt(int idx){
    Node temp = head;
    for(int i=0; i<=idx-1; i++){
        temp=temp.next;
    }
    return temp.data;
}

//delete at index method
void deleteAtIndex(int idx){
      if(idx==0){
        head=head.next;
        size--;
        return;
      }
    Node temp = head;
    for(int i=1; i<=idx-1; i++){
        temp=temp.next;
    }
    temp.next=temp.next.next;
    if(idx==size-1)tail=temp;
    size--;
}

//Display Function
       void display (){
       Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("");
    }

//Reverse a linkedlist

public void reverse(){
    
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
head=prev;
}

//Size
       /*  int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
*/
       

    }

    public static void main(String[] args) {
LinkedList ll = new LinkedList();

ll.insertAtEnd(5);
ll.display();
ll.insertAtEnd(4);
ll.display();
ll.insertAtEnd(3);
ll.display();
ll.insertAtEnd(2);
ll.display();
ll.insertAtHead(90);
ll.display();
ll.insertAt(3, 100);
ll.display();


// System.out.println(ll.head.data);
// System.out.println(ll.tail.data);
// System.out.println(ll.getAt(4));
// System.out.println(ll.size);

// ll.display();
ll.deleteAtIndex(4 );
ll.display();
// System.out.println(ll.tail.data);
// ll.reverse();
// ll.display();
        


    }
    
}
