class GfG {
    int maxLen(int arr[], int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>(); // index against sum
        int i = -1;
        int sum = 0;
        int max = 0;
        map.put(sum, i);

        while (i < arr.length - 1) {
            i++;

            sum += arr[i];

            if (map.containsKey(sum) == false) {
                map.put(sum, i);

            } else {
                int len = i - map.get(sum);
                max = Math.max(len, max);
            }
        }

        return max;
    }
}