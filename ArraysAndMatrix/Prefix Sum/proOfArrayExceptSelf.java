// package ArraysAndMatrix.Prefix Sum;

import java.util.*;

public class proOfArrayExceptSelf {

   public static void main(String[] args) {

      /*
       * Given an integer array nums, return an array answer such that answer[i] is
       * equal to the product of all the elements of nums except nums[i].
       * 
       * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
       * integer.
       * 
       * You must write an algorithm that runs in O(n) time and without using the
       * division operation.
       * 
       * 
       * 
       * Example 1:
       * 
       * Input: nums = [1,2,3,4]
       * Output: [24,12,8,6]
       */

      int arr[] = { 1, 2, 3, 4 };
      int n = arr.length;

      int ans[] = new int[n];

      int prefixProd = 1;

      for (int i = 0; i < n; i++) {
         ans[i] = prefixProd;
         prefixProd *= arr[i];
      }

      int suffixProd = 1;

      for (int i = n - 1; i >= 0; i--) {
      ans[i] *= suffixProd;
      suffixProd *= arr[i];

      }

      for (int num : ans) {
         System.out.print(num + " ");
      }

   }

}
