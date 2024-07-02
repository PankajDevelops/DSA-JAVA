package CoCubes;

public class printNumInRange {

//Question 1: Counting the Numbers Within Given Range having digits(1,4,9) ?
// Sample TestCase :

// Input :
// 100 --- start limit
// 200 --- end limit

// Output :
// 9

// Explanation : It means that the number should be with digits(1,4,9).for example
// assume 146, in this 1 and 4 are accepted but 6 is not allowed so this number is not
// considered.
// The numbers between 100 and 200 are [111, 114, 119, 141, 144, 149, 191, 194, 199]


    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        
        for(int ans = a; ans < b; ans++){

            int count = 0;
            int num = ans;
            
            while(num>0){

            int digit = num%10;

            if(digit == 1 || digit == 4 || digit==9){
                count++;
            }

            else{ 
                count=0;
            }

            num=num/10;

            }

            if(count==3){
                System.out.print(ans+" ");
            }

        }
        
    }
    
}




