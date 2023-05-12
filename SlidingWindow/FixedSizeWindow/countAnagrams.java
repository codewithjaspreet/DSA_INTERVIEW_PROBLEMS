class Solution {

    int search(String pat, String txt) {
        HashMap<Character, Integer> map = new HashMap<>();
        int k = pat.length();

        // Count the occurrences of each character in the pattern
        for (char c : pat.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        int j = 0;
        int count = map.size(); // Number of distinct characters in the pattern
        int ans = 0;

        while (j < txt.length()) {
            // If current character is in the pattern, decrement its count in the map
            if (map.containsKey(txt.charAt(j))) {
                map.put(txt.charAt(j), map.get(txt.charAt(j)) - 1);
                // If the count of the current character becomes zero, decrement the count of distinct characters
                if (map.get(txt.charAt(j)) == 0) {
                    count--;
                }
            }

            if (j - i + 1 < k) { // If window size is less than k, increment j
                j++;
            } else if (j - i + 1 == k) { // If window size is equal to k
                // If all distinct characters of the pattern are present in the current window
                if (count == 0) {
                    ans++;
                }
                // Increment i and update the map and count accordingly
                if (map.containsKey(txt.charAt(i))) {
                    map.put(txt.charAt(i), map.get(txt.charAt(i)) + 1);
                    if (map.get(txt.charAt(i)) == 1) {
                        count++;
                    }
                }
                i++;
                j++;
            }
        }

        return ans;
    }
}