package Sorting.Algorithms.Sorting02;

public class quickSortMin {

    public static void print(int brr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int s, int e) {

        if (s >= e)
            return;

        int pivot = partition(arr, s, e);

        quickSort(arr, s, pivot - 1);
        quickSort(arr, pivot + 1, e);
    }

    public static int partition(int arr[], int s, int e) {

        int i = s - 1;
        int pi = arr[e];

        for (int j = s; j < e; j++) {
            if (arr[j] < pi) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;

        int temp = arr[e];
        arr[e] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {

        int arr[] = { 4, 6, 2, 4, 8, 4, 9, 1 };

        print(arr, arr.length);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("");

        print(arr, arr.length);

    }

}
