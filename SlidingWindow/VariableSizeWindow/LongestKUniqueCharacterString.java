
// variable size sliding window
// find the longest substring with k unique characters
// Time Complexity: O(n)  , Space Complexity: O(n)

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here

        Map<Character, Integer> map = new HashMap<>();
        int j = 0;
        int i = 0;
        int max = -1;

        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (map.size() == k) {
                max = Math.max(max, j - i + 1);
            } else if (map.size() > k) {
                while (map.size() > k) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0)
                        map.remove(s.charAt(i));
                    i++;
                }
            }
            j++;
        }
        return max;
    }
}