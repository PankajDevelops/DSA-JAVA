package BinarySearch;

public class BinarySearch {

    public static int searchBinary(int arr[], int size, int key) {

        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == key) {
                return mid;
            }

            else if (key > arr[mid]) {
                start = mid + 1;
            }

            else if (key < arr[mid]) {
                end = mid - 1;
            }

            mid = start + (end - start) / 2;
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 7, 9, 11 };
        int[] brr = { 2, 4, 6, 8, 10, 12 };

        int oddIndex = searchBinary(arr, 6, 11);
        int evenIndex = searchBinary(brr, 6, 6);

        System.out.println("oddIndex: " + oddIndex);
        System.out.println("evenIndex: " + evenIndex);

    }
}