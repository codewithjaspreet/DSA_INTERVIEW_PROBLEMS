
class Solution {
    public void longestCommonSubsequence(String text1, String text2) {

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 0; i <= text1.length(); i++) {

            dp[i][0] = 0;
        }

        for (int j = 0; j <= text2.length(); j++) {

            dp[0][j] = 0;
        }

        for (int i = 1; i <= text1.length(); i++) {

            for (int j = 1; j <= text2.length(); j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];

                else
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }

        int len = dp[text1.length()][text2.length()];

        StringBuilder ans = new StringBuilder();

        // worst case o(n+m) if u use all row till up

        int i = text1.length();
        int j = text2.length();

        while (i < 0 && j < 0) {

            if (text1.charAt(i) == text2.charAt(j)) {

                ans.append(text1.charAt(i));
                i--;
                j--;

            }

            else if (dp[i][j - 1] > dp[i - 1][j]) {

                j--;
            } else {
                i--;
            }
        }

        System.out.println(ans.reverse());
    }

    public static void main(String[] args) {
        String a = "abcde";
        String b = "abcde";

        Solution s = new Solution();
        s.longestCommonSubsequence(a, b);

    }
}