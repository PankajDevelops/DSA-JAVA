import java.util.*;

import Queues.arrayImp.QueueA;

public class arrayImp {

    public static class QueueA{
        
        int f = -1;
        int r = -1;

        int arr[] = new int[5];

        int size = 0;

        public void push(int val){
              if (r == arr.length - 1) {
                System.out.println("Queue is Full !!!");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = val;
            } 
            else {
                arr[++r] = val;
            }

            size++;
        }


    }

    public static void main(String[] args) {
        
        QueueA q = new QueueA();






    }
    
}
