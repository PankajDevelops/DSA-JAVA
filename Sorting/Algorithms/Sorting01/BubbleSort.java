// package Sorting.Algorithms.Sorting01;

public class BubbleSort {

    public static void swap(int brr[], int a, int b) {
        int temp = brr[a];
        brr[a] = brr[b];
        brr[b] = temp;
    }

    public static void print(int brr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 5, 4, 7, 8, 6, 9 };
        int n = 7;
        print(arr, 7);
        System.out.println("");

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }

        print(arr, 7);

    }
}
