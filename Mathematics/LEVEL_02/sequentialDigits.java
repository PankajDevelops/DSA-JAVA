package Maths.LEVEL_02;

/*An integer has sequential digits if and only if each digit in the number is one more than the previous digit.

Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.

 

Example 1:

Input: low = 100, high = 300
Output: [123,234]
Example 2:

Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345] */


import java.util.*;
public class sequentialDigits {

    public static void main(String[] args) {
        
        int low = 1000;
        int high = 13000;

        List<Integer> ls = new ArrayList<>();

        for(int i=1; i<=9; i++){

            int num = i;
            int nextNum = i+1;

            while(nextNum<=9 && num<=high){

                num = num * 10 + nextNum;

                if(num>=low && num<=high){
                    ls.add(num);
                }

                nextNum++;
            }
        }

        Collections.sort(ls);

        System.out.println(ls);


    }
    
}
