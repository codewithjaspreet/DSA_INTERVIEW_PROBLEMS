class Solution {
    ArrayList<Integer> countDistinct(int A[], int n, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;

        while (j < A.length) {
            map.put(A[j], map.getOrDefault(A[j], 0) + 1);

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                arr.add(map.size());

                if (map.get(A[i]) == 1) {
                    map.remove(A[i]);
                } else {
                    map.put(A[i], map.get(A[i]) - 1);
                }

                i++;
                j++;
            }

        
        }

        return arr;
    }
}

