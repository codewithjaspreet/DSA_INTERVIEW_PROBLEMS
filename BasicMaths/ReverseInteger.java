class Solution {
    public int reverse(int x) {

        boolean negative = false;

        // if no is negative first make it positive for reversal

        if (x < 0) {

            negative = true;
            x = x * -1;
        }

        long reversed = 0; // to avoid overflow we take long

        while (x > 0) {

            reversed = (reversed * 10) + (x % 10); // grab each digit using x%10 -> & keep reversing

            x /= 10; // drop down the used digit once reversed

        }

        if (reversed > Integer.MAX_VALUE)
            return 0; // if overflowed

        return negative ? (int) (-1 * reversed) : (int) reversed;

        // if the no was initially negative return it as a negative no, else the
        // computed one with +ve sign
    }
}