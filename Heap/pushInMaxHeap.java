package Heap;
import java.util.*;

public class pushInMaxHeap {

    public static void swap(List<Integer> ls, int l, int r){
        int temp = ls.get(l);
        ls.set(l,ls.get(r));
        ls.set(r,temp);
    }

    public static void posInMaxHeap(List<Integer> ls, int idx){

        int parentIdx =(idx-1)/2;
        if(idx==0 || ls.get(idx)<ls.get(parentIdx)) return;

        swap(ls,idx,parentIdx);
        posInMaxHeap(ls, parentIdx);
    }

    public static void insertInMaxHeap(List<Integer> ls, int x){

        ls.add(x);
        int size = ls.size()-1;
        posInMaxHeap(ls,size);
    }

    public static void delete_from_maxHeap(List<Integer> ls){

        swap(ls,0,ls.size()-1);
        pushDownInMaxHeap(ls,0);
    }

    public static void pushDownInMaxHeap(List<Integer> ls, int idx){

        int n = ls.size()-1;
        if(idx==n){
            return;
        }

        int left = (2*idx)+1;
        int right = (2*idx)+2;
        int biggest = idx;

        if(left<=n && ls.get(left) < ls.get(biggest)){
            biggest = left;
        }
        if (right<=n && ls.get(right) < ls.get(biggest)) {
            biggest = right;
        }

        if(biggest==idx) return;
        swap(ls, biggest, idx);
        pushDownInMaxHeap(ls, biggest);
    }
// heapify
    public static void heapify(List<Integer> arr){

        int firstNon_leafNode = ((arr.size()-1)-1)/2; //last elements ka parent

        for(int i=firstNon_leafNode; i>=0; i--){
            pushDownInMaxHeap(arr, i);
        }
    }

    public static void main(String[] args) {
        
        List<Integer> ls = new ArrayList<>();

        ls.add(5);
        ls.add(20);
        ls.add(10);
        ls.add(40);
        ls.add(50);
        ls.add(30);
        ls.add(60);

        // System.out.println(ls);
        // insertInMaxHeap(ls,40);
        System.out.println(ls);

    }
    
}
