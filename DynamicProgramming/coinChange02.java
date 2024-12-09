package DynamicProgramming;

public class coinChange02 {

    public static int nop(int arr[], int[][] dp, int amount, int idx) {

        if(dp[idx][amount]!=-1) return dp[idx][amount];

        if (idx == 0) {
            if (amount % arr[idx] == 0)
                return 1;
            else
                return 0;
        }

        int pick = 0;

        if (amount >= arr[idx])
            pick = nop(arr, dp, amount - arr[idx], idx);

        int notPick = nop(arr, dp, amount, idx - 1);

        return dp[idx][amount] = pick + notPick;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 5 };
        int amount = 5;

        int n = arr.length;

        int[][] dp = new int[n + 1][amount + 1];

        for(int i=0; i<=n; i++){
            for(int j=0; j<=amount; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(nop(arr, dp, amount, n - 1));

    }

}
