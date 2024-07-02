package DynamicProgramming;

public class DP_houseRobber {

    static int rob(int[] houses, int idx, int dp[]) {

        if (idx == houses.length - 1)
            return houses[idx];
        if (idx >= houses.length)
            return 0;

        if(dp[idx]!=-1) return dp[idx];

        int pick = houses[idx] + rob(houses, idx + 2,dp);
        int not_pick = rob(houses, idx + 1,dp);

        return dp[idx] = Math.max(pick, not_pick);
    }

    public static void main(String[] args) {

        /*
         * You are a proffesional robber planning to rob houses along a street. Each
         * house has a certain amount of money stashed, the only
         * constraint stopping you from robbing each automatically contact the police if
         * ttwo adjacent houses were broken into on the
         * same night.
         * Given an integer array nums representing the amount of money of each house ,
         * return the maximum amount of money you can rob tonight without
         * alerting the police.
         * 
         * nums = [1, 2, 3, 1];
         * output: 4;
         * Exp: Rob house1(money=1) ans then rob house 3(money=3).
         * total amount you can rob = 1 + 3 = 4;
         */

        // int arr[] = {1,2,3,1};
        int arr[] = { 9, 1, 3, 8 };

        int[] dp = new int[arr.length];

        for(int i=0; i<dp.length; i++){
            dp[i] = -1;
        }

        System.out.println(rob(arr, 0,dp));

    }

}
