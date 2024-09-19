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

    public static void main(String[] args) {
        
        List<Integer> ls = new ArrayList<>();

        ls.add(60);
        ls.add(50);
        ls.add(40);
        ls.add(30);
        ls.add(20);
        ls.add(30);
        ls.add(10);

        System.out.println(ls);
        insertInMaxHeap(ls,40);
        System.out.println(ls);

    }
    
}
