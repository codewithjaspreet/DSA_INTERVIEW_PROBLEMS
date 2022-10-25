// naive  - tle 
class Solution {
    public double myPow(double x, int n) {

        if (n == 0)
            return 1;

        if (n == 1)
            return x;

        if (n < 0)
            return myPow(1 / x, -n);

        double result = 1;

        for (int i = 0; i < n; i++) {

            result *= x;

        }

        return result;
    }
}