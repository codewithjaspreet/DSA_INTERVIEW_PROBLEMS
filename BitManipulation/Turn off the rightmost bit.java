class Solution {

    public static int clearBit(int N) {
        // code here
        return (N & N - 1);
    }
}