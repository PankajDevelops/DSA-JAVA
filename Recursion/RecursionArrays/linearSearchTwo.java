import java.util.*;

import java.util.ArrayList;

public class linearSearchTwo {

    public static ArrayList<Integer> findIndex(int arr[], int X, int i) {

        ArrayList<Integer> ls = new ArrayList<>();

        if (i >= arr.length) {
            return new ArrayList<Integer>();
        }

        if (arr[i] == X)
            ls.add(i);

        ArrayList<Integer> smallAns = findIndex(arr, X, i + 1);

        ls.addAll(smallAns);

        return ls;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 2, 2, 5 };
        int X = 2;
        int i = 0;

        ArrayList<Integer> ls = findIndex(arr, X, i);

        for (int num : ls) {
            System.out.print(num + " ");
        }

    }

}
