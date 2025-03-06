package BitMasking;

public class XOrSubArray {

    public static void main(String[] args) {

        int arr[] = { 4, 2, 2, 6, 4 };
        int n = arr.length;

        int x = 6;
        int xor = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("");
            }
        }

    }

}
