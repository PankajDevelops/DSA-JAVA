// package BinarySearch;

public class recursiveBinarySearch {

    public static boolean binarySearch(int arr[], int key, int start, int end) {

        int mid = start + (end - start) / 2;

        if (arr[mid] == key)
            return true;

        if (arr[mid] > key)
            return binarySearch(arr, key, start, mid - 1);

        if (arr[mid] < key)
            return binarySearch(arr, key, mid + 1, end);

        return false;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 9;

        int start = 0;
        int end = arr.length - 1;

        System.out.println(binarySearch(arr, key, start, end));

    }

}
