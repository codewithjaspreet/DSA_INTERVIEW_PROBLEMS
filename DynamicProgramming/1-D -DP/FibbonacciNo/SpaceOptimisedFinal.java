class Solution {
    public int fib(int n) {
        if (n <= 1)
            return n;

        // for the nth Fibonacci we only need n - 1 and n - 2 element
        // here we take 2 variable
        // last and secondLast

        int last = 1;
        int secondLast = 0;

        for (int i = 2; i <= n; i++) {
            int sum = last + secondLast;

            secondLast = last;
            last = sum;
        }

        return last;
    }
}