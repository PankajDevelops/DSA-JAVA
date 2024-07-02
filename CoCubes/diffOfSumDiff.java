package CoCubes;

public class diffOfSumDiff {

// Question 2: Find Difference of the Sum of Divisibles upto N by k and Sum of Non
// Divisibles upto N by k.Where N is given number,k is divisor.

// Sample TestCase :

// Input :
// 20
// 4
// Output :
// 90

// Explanation :
// Divisibles upto 20 by 4 : [4,8,12,16,20]
// Sum of Divisibles = 60
// Non-Divisibles upto 20 by 4 : [1,2,3,5,6,7,9,10,11,13,14, 15, 17, 18, 19]
// Sum of Non-Divisibles= 150

// Difference of 150 and 60 = 90

    public static void main(String[] args) {

        int a = 20;
        int b = 4;

        int sumD = 0;
        int sumN = 0;

        for(int i=1; i<=a; i++){
            if(i%b==0){
                sumD+=i;
            }
            else{
                sumN+=i;
            }
        } 
        
        System.out.println(sumN-sumD);
    }
    
}
