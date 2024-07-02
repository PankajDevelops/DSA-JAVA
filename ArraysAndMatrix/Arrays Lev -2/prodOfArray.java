public class prodOfArray {

    public static void main(String[] args) {

        /*
         * 238. Product of Array Except Self
         * 
         * Given an integer array nums, return an array answer such that answer[i] is
         * equal to the product of all the elements of nums except nums[i].
         * 
         * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
         * integer.
         * 
         * You must write an algorithm that runs in O(n) time and without using the
         * division operation.
         */

        int arr[] = { 1, 2, 3, 4 };
        int n = arr.length;

        int ans[] = new int[n];

        int leftProd = 1;

        for (int i = 0; i < n; i++) {
            ans[i] = leftProd;
            System.out.print(ans[i] + " ");
            leftProd *= arr[i];
        }
        System.out.println("");
        int rightProd = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProd;
            System.out.print(ans[i] + " ");
            rightProd *= arr[i];

        }

        System.out.println("");

        for (int num : ans) {
            System.out.print(num + " ");+++
        }

    }

}
