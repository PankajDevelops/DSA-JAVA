package Mathematics.LEVEL_02;

public class climbingStairs {

    public static int ansOfClimbStairs(int n){

        if(n<=1) return n;

        int num1 = 0;
        int num2 = 1;

        int ans = 0;

        for(int i=0; i<n; i++){

            ans = num1+num2;
            num1 = num2;
            num2 = ans;

        }

        return ans;

    }

    public static void main(String[] args) {
        
        int n = 13;

        System.out.println(ansOfClimbStairs(n));




    }
}
