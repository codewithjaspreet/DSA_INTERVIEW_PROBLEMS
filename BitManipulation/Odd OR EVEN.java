class Solution {
    static String oddEven(int N) {
        // code here

        if (((N & 1) != 1))
            return "even";
        else
            return "odd";
    }
}