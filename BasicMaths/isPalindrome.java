class Solution {
    public String is_palindrome(int n) {
        // Code here

        StringBuilder sb = new StringBuilder();

        String x1 = Integer.toString(n);

        for (int i = x1.length() - 1; i >= 0; i--) {

            sb.append(x1.charAt(i));
        }

        return x1.equals(sb.toString()) ? "Yes" :  "No";
    }
}
