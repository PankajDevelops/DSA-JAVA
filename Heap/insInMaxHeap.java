import java.util.ArrayList;
import java.util.List;

public class insInMaxHeap {

    public static void swap(List<Integer> heap, int l, int r){

        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r,temp);
    }


    public static void pushUpInMaxHeap(List<Integer> heap, int i){

        int parentIndex = (i-1)/2;

        if(i==0 || heap.get(parentIndex) > heap.get(i)){
            return ;
        }

        swap(heap, i, parentIndex);
        pushUpInMaxHeap(heap, parentIndex);

    }

    public static void insertInMaxHeap(List<Integer> heap, int element){

        heap.add(element);
        int index = heap.size()-1;

        pushUpInMaxHeap(heap,index);
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
        insertInMaxHeap(heap, 55);
        System.out.println(heap);

    }
    
}
