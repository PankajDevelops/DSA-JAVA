package Sorting.Algorithms.Sorting01;
public class SelectionSort {

	public static void swap(int brr[], int a, int b) {
		int temp = brr[a];
		brr[a] = brr[b];
		brr[b] = temp;
	}

	public static void print(int brr[], int n) {
		for (int i = 0; i <= n - 1; i++) {
			System.out.print(brr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 5, 4, 7, 8, 6, 9 };
		int n = arr.length;
		print(arr, 7);
		System.out.println("");

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}

		print(arr, 7);

		
	}
}
