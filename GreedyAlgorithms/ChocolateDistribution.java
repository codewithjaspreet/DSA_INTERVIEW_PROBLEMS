// sort and then find the min and max values sliding the window
class Solution {

    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here

        int ans = Integer.MAX_VALUE;

        int[] arr = new int[a.size()];

        int k = 0;
        for (int i : a) {

            arr[k] = i;
            k++;

        }

        Arrays.sort(arr);

        for (int i = 0; i <= n - m; i++) {

            int min = arr[i];
            int max = arr[i + m - 1];

            int gap = max - min;
            ans = Math.min(gap, ans);
        }

        return ans;

    }
}