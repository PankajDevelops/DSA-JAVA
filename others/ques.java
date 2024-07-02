import java.util.*;

public class ques {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5,9};

        int index = 1;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                arr[index++] = arr[i];
            }
        }

        for (int i = index; i < arr.length; i++) {
            arr[i] = 0; 
        }

        System.out.println("Original Array: "+Arrays.toString(arr));
    }
}
