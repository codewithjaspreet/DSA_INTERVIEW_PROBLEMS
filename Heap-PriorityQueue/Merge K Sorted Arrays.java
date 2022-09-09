
// time complexity of O(K^2 log K) where K is the number of arrays
// space complexity of O(K) where K is the number of arrays

class Solution {
    // Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K) {
        // Write your code here.
        ArrayList<Integer> temp = new ArrayList<Integer>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < K; i++) {

            for (int j = 0; j < K; j++) {

                pq.add(arr[i][j]);
            }
        }

        while (pq.size() > 0) {

            temp.add(pq.poll());
        }

        return temp;

    }
}