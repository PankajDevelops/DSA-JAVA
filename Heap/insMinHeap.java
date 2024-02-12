import java.util.*;

public class insMinHeap{


    static void swap (List<Integer> heap, int l, int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }


    static void pushUpInMinHeap(List<Integer>heap, int i){

        int parentIndex = (i-1)/2;
        //until root rech or correct position found 
        if(i==0 || heap.get(parentIndex) < heap.get(i)){
            return ;
        }

        //swap the values

        swap(heap, i, parentIndex);

        pushUpInMinHeap(heap, parentIndex);

    }

    static void insertInMinHeap(List<Integer>heap, int element){

        heap.add(element);
        int index = heap.size()-1;

        pushUpInMinHeap(heap,index);

    }

    public static void main(String[] args) {

        List <Integer> heap = new ArrayList<>();

        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);

        System.out.println(heap);
        insertInMinHeap(heap,5);
        System.out.println(heap);
        


    }
}