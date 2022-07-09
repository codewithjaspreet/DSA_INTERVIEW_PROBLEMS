
// code studio  - time limit exceeded

public class Solution {
    public static int ninjaTraining(int n, int points[][]) {

        return helper(n - 1, 3, points);
    }

    public static int helper(int day, int last, int[][] points) {

        if (day == 0) {

            int maxi = 0;
            for (int task = 0; task < 3; task++) {
                if (task != last)
                    maxi = Math.max(maxi, points[0][task]);
            }

            return maxi;
        }

        int maxi = 0;

        for (int task = 0; task < 3; task++) {

            if (task != last) {
                int point = points[day][task] + helper(day - 1, task, points);
                maxi = Math.max(maxi, point);
            }
        }

        return maxi;
    }

}