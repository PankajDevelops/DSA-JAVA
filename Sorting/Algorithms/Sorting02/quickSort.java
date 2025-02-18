package Sorting.Algorithms.Sorting02;

public class quickSort {

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

    public static void quickSort(int arr[], int start, int end) {

        if (start >= end)
            return;

        int pi = partition(arr, start, end);

        quickSort(arr, start, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    public static int partition(int arr[], int start, int end) {

        int pivot = arr[start];
        int count = 0;

        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot)
                count++;
        }

        int piIdx = start + count;

        swap(arr, start, piIdx);

        int i = start;
        int j = end;

        while (i < piIdx && j > piIdx) {
 
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i < piIdx && j > piIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return piIdx;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 5, 1, 6, 3, 9, 8, 7 };
        int n = arr.length;

        print(arr, n);

        System.out.println("");

        quickSort(arr, 0, n - 1);

        print(arr, n);

    }

}
