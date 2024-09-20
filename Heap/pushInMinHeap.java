package Heap;

import java.util.*;

public class pushInMinHeap {

    public static void swap(List<Integer> ls, int l, int r) {

        int temp = ls.get(l);
        ls.set(l, ls.get(r));
        ls.set(r, temp);
    }

    public static void checkPos(List<Integer> ls, int idx) {

        int parent_idx = (idx - 1) / 2;

        if (idx == 0 || ls.get(parent_idx) < ls.get(idx))
            return;

        swap(ls, idx, parent_idx);

        checkPos(ls, parent_idx);

    }

    public static void insertElement(List<Integer> ls, int x) {

        ls.add(x);
        int idx = ls.size() - 1;
        checkPos(ls, idx);
    }

    //----------------------
    public static void delete_from_minHeap(List<Integer> ls) {

        swap(ls, 0, ls.size() - 1);
        pushDownInMinHeap(ls, 0);
    }

    public static void pushDownInMinHeap(List<Integer> ls, int idx) {

        int n = ls.size() - 1;
        if (idx == n) {
            return;
        }

        int left = (2 * idx) + 1;
        int right = (2 * idx) + 2;
        int smallest = idx;

        if (left <= n && ls.get(left) < ls.get(smallest)) {
            smallest = left;
        }
        if (right <= n && ls.get(right) < ls.get(smallest)) {
            smallest = right;
        }

        if (smallest == idx)
            return;
        swap(ls, smallest, idx);
        pushDownInMinHeap(ls, smallest);
    }

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();

        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);

        System.out.println(ls);
        insertElement(ls, 5);
        System.out.println(ls);

    }

}
