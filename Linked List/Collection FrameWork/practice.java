public class practice{


        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
            }
        }
        
        //remove nth node from END
        public static Node removeNthNodeEnd(Node head, int n){
            Node fast=head;
            Node slow=head;
        
            for(int i=0; i<n;i++){
                fast=fast.next;
                
            }
            if(fast==null){
                head=head.next;
                return head;
            }
        
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
            return head;
        
        }
        
        //Display Function
        public static void display (Node head){
            Node temp=head;
             while(temp!=null){
                 System.out.print(temp.data+" ");
                 temp = temp.next;
             }
             System.out.println("");
         }
        
        public static void main(String[] args) {
        
            Node a = new Node(54);
            Node b = new Node(23);
            Node c = new Node(32);
            Node d = new Node(5);
            Node e = new Node(45);
            Node f = new Node(56);
        
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;
        
         
        
        
           display(a);
           a=removeNthNodeEnd(a, 6);
           display(a);
        
        }
        
            
        

    
}