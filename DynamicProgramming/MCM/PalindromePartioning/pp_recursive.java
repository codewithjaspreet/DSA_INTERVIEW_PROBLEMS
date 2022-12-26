package PalindromePartioning;


// recursive
class Solution {
    public int minCut(String s) {

        return helper(s, 0, s.length() - 1);
    }

    static int helper(String s, int i, int j) {

        if (i >= j || i == j)
            return 0;

        if (isPalindrome(s, i, j))
            return 0;

        int ans = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {

            int temp = 1 + helper(s, i, k) + helper(s, k + 1, j);

            ans = Math.min(temp, ans);
        }

        return ans;
    }

    static boolean isPalindrome(String s, int i, int j) {

        int left = i;
        int right = j;

        char[] ch = s.toCharArray();

        while (left < right) {

            if (ch[left] != ch[right])
                return false;
            else
                left++;
            right--;
        }

        return true;
    }
}