class Solution {

    public static int SetRightMostOff(int N) {
        // code here
        return (N & N - 1);
    }
}