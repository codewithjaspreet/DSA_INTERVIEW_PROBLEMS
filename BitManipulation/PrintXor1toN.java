// naive o (n)

import java.io.*;

public class GFG {
    public static void main(String[] args) {
        int n = 7;
        int ans = computeXor(n);
        System.out.println(ans);
    }

    static int computeXor(int n) {
        if (n == 0)
            return 0; // base case
        int uni = 0;
        for (int i = 1; i <= n; i++) {

            uni = uni ^ i; // calculate XOR
        }
        return uni;
    }

}

// optimised o(1)

class GFG {
    // Method to calculate xor
    static int computeXOR(int n) {
        // If n is a multiple of 4
        if (n % 4 == 0)
            return n;

        // If n%4 gives remainder 1
        if (n % 4 == 1)
            return 1;

        // If n%4 gives remainder 2
        if (n % 4 == 2)
            return n + 1;

        // If n%4 gives remainder 3
        return 0;
    }

    // Driver method
    public static void main(String[] args) {
        int n = 5;
        System.out.println(computeXOR(n));
    }
}