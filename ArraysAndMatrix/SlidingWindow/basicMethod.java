package ArraysAndMatrix.SlidingWindow;

public class basicMethod {

    public static void main(String[] args) {

        int[] arr = { 100, 200, 300, 400, 500 };
        int n = arr.length;
        int k = 3;

        int currSum = 0;
        int maxSum = 0;

        maxSum = currSum;

        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }

        int j = 0;

        for (int i = k; i < n; i++) {
            currSum -= arr[j++];
            currSum += arr[i];

            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println(maxSum);

    }

}
