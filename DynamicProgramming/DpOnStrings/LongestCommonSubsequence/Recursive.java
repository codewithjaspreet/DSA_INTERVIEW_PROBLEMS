
// tle 2^n

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        return helper(text1.length() - 1, text2.length() - 1, text1, text2);
    }

    public static int helper(int i1, int i2, String text1, String text2) {

        if (i1 < 0 || i2 < 0)
            return 0;

        if (text1.charAt(i1) == text2.charAt(i2)) {

            return 1 + helper(i1 - 1, i2 - 1, text1, text2);
        }

        return Math.max(helper(i1 - 1, i2, text1, text2), helper(i1, i2 - 1, text1, text2));
    }
}