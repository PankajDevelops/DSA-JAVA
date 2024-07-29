package Sorting.QuesSet;

public class checkLexoStrings {

    public static void swap(String brr[], int a, int b) {
        String temp = brr[a];
        brr[a] = brr[b];
        brr[b] = temp;
    }

    public static void print(String brr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    public static void sort(String arr[], int n) {

        for (int i = 0; i < n - 1; i++) {

            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if ((arr[j]).compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }

            swap(arr, i, minIdx);
        }
    }

    public static void main(String[] args) {

        String arr[] = { "kiwi", "apple", "papya", "mango" };
        int n = arr.length;

        print(arr, n);
        System.out.println("");

        sort(arr, n);
        print(arr, n);
    }
}

