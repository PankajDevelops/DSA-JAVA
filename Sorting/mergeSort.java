package Sorting;

public class mergeSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void sortMerge(int arr[], int si, int ei) {

        int mid = si + (ei - si) / 2;
        if (si >=ei)
            return;

        sortMerge(arr, si, mid);
        sortMerge(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
 
        int temp[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i++];
            } else {
                temp[k] = arr[j++];
            }

            k++;
        }

        // left part

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // left part

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {

        int arr[] = { 6, 3, 9, 5, 2, 8 };

        printArray(arr);

        sortMerge(arr, 0, arr.length - 1);

        printArray(arr);

    }

}
