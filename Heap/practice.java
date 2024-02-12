import java.util.*;

public class practice {


    public static void swap(List<Integer> heap, int l, int r){

        int temp = heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);

    }


    public static void pushUpInMinHeap(List<Integer> heap, int i){

        int parentIndex = (i-1)/2;

        if(i==0 || heap.get(parentIndex) < heap.get(i)){
            return;
        }

        swap(heap, i, parentIndex);
        pushUpInMinHeap(heap, parentIndex);

    }
    

    public static void insertInMinHeap(List<Integer> heap, int element){

        heap.add(element);
        int index = heap.size()-1;

        pushUpInMinHeap(heap,index);
    }

    public static void deleteFromMinHeap(List<Integer>heap){

        swap(heap, 0, heap.size()-1);
        heap.remove(heap.size()-1);

    }

    
    public static void main(String[] args) {

        List<Integer> heap = new ArrayList<>();

        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(20);

        System.out.println(heap);

        System.out.println(heap);

    }
}
