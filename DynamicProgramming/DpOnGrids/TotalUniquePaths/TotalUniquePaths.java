
// tc = 2^M+N
// sc  - stack space of O(path length) = O(n-1 + m - 1);
// TLE FOR BIGGER VALUES

// problem link - https://www.codingninjas.com/codestudio/problems/total-unique-paths_1081470?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos&leftPanelTab=0

import java.util.*;
import java.io.*;

public class Solution {
    public static int uniquePaths(int m, int n) {
        // Write your code here.

        return helper(m - 1, n - 1);
    }

    public static int helper(int i, int j) {

        if (i == 0 && j == 0)
            return 1;
        if (i < 0 || j < 0)
            return 0;

        int up = helper(i - 1, j);
        int left = helper(i, j - 1);

        return up + left;
    }
}