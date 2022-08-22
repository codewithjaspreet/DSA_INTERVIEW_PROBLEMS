// link : - https://practice.geeksforgeeks.org/problems/count-digits5716/1

class Solution {
    static int evenlyDivides(int N) {
        int temp = N, count = 0;

        while (temp != 0) {

            // extract the last digit
            int d = temp % 10;
            temp /= 10;

            // check if d divide N completly
            if (d > 0 && N % d == 0)
                count++;
        }

        return count;
    }
}