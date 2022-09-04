
// revise logic 

class Solution {
    static int minimumDays(int S, int N, int M) {
        // code here

        int sunday = S / 7;

        int bd = S - sunday;

        int tf = S * M;

        int ans = 0;

        if (tf % N == 0) {

            ans = tf / N;
        } else {

            ans = tf / N + 1;
        }

        // N= 1 , M = 1 , S = 10
        if (ans <= bd)
            return ans;

        else
            return -1;

    }
}