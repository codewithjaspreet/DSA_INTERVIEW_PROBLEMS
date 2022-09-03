class Solution {

    public static boolean meetingRooms(int intervals[][]) {
        // write code

        // sort the 2d array on the basis of the start time

        if (intervals.length == 0 || intervals.length == 1)
            return true;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int ep = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] < ep) {

                return false;

            }

            else {

                ep = intervals[i][1];
            }
        }

        return true;

    }
}