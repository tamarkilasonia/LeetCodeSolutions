package leetcode.solutions.string;

public class DecodeWays {
    public int numDecodings(String s) {
        int n = s.length();

        if (s.charAt(0) == '0') return 0;

        int[] dp = new int[n + 1];
        dp[0] = 1; // empty string
        dp[1] = 1; // first char already checked

        for (int i = 2; i <= n; i++) {
            char one = s.charAt(i - 1);
            char two1 = s.charAt(i - 2);


            if (one != '0') {
                dp[i] += dp[i - 1];
            }


            int twoDigit = (two1 - '0') * 10 + (one - '0');
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

}
