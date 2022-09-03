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

class Solution {

    static class meeting {
        int start;
        int end;
        int pos;

        meeting(int start, int end, int pos) {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }

    static class meetingComparator implements Comparator<meeting> {
        @Override
        public int compare(meeting o1, meeting o2) {
            if (o1.end < o2.end)
                return -1;
            else if (o1.end > o2.end)
                return 1;
            else if (o1.pos < o2.pos)
                return -1;
            return 1;
        }
    }

    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n) {
        int c = 1;

        ArrayList<meeting> meet = new ArrayList<>();

        for (int i = 0; i < start.length; i++)
            meet.add(new meeting(start[i], end[i], i + 1));

        meetingComparator mc = new meetingComparator();
        Collections.sort(meet, mc);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for (int i = 1; i < start.length; i++) {
            if (meet.get(i).start > limit) {
                c++;
                limit = meet.get(i).end;
                answer.add(meet.get(i).pos);
            }
        }

        return c;
    }
}
