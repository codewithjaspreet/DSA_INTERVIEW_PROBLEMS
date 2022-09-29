
// hashmap sliding window approach

// Time Complexity: O(n)  , Space Complexity: O(n)
class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0;
        int j = 0;
        int count = 0;
        int len = s.length();
        hm.put('a', 0);
        hm.put('b', 0);
        hm.put('c', 0);

        while (j < len) {
            hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0) + 1);

            if (hm.get('a') > 0 && hm.get('b') > 0 && hm.get('c') > 0) {
                count += len - j;
            }

            while (hm.get('a') > 0 && hm.get('b') > 0 && hm.get('c') > 0) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
                i++;

                if (hm.get('a') > 0 && hm.get('b') > 0 && hm.get('c') > 0) {
                    count += len - j;
                }

            }
            j++;

        }

        return count;

    }

}

// two pointer - 3 size array sliding window approach

class Solution {
    public int numberOfSubstrings(String s) {

        int left = 0;

        int res = 0;
        int[] arr = new int[3];

        for (int i = 0; i < s.length(); i++) {

            arr[s.charAt(i) - 'a']++;

            while (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) {

                res += s.length() - i;
                arr[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return res;
    }
}
