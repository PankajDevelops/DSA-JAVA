package DynamicProgramming;

/*
   A message containing letters from A to Z can be encoded into numbers using
    the following magazine A -> 1 || b -> to 2 || Z -> to 26 code.
   */
public class DP_decodeString {

    static int no_of_ways(String number, int idx, int[] dp) {

        if (idx <= 0)
            return 1;

        if (dp[idx] != -1)
            return dp[idx];

        int not_combine = 0;
        if (number.charAt(idx) != '0') {
            not_combine = no_of_ways(number, idx - 1, dp);
        }

        int combine = 0;
        if (number.charAt(idx - 1) == '1' || (number.charAt(idx - 1) == '2' && number.charAt(idx) <= '6')) {
            combine = no_of_ways(number, idx - 2, dp);
        }

        return dp[idx]=not_combine + combine;
    }

    public static void main(String[] args) {

        String str = "06";

        int[] dp = new int[str.length()];
        for (int i = 0; i < dp.length; i++)
            dp[i] = -1;
        System.out.println(no_of_ways(str, str.length() - 1, dp));

    }

}
