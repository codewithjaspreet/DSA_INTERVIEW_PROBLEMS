class Solution {
    static int sumOfDigits(int n) {
        // code here

        if (n == 0)
            return 0;

        return n % 10 + sumOfDigits(n / 10);
    }
}
