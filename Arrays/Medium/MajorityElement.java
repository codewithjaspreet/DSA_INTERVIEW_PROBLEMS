// approach1 :  O(n) time and O(n) space
// Hashmap approach
class Solution {
    public int majorityElement(int[] nums) {

        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : nums) {

            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (int a : map.keySet()) {

            if (map.get(a) > nums.length / 2) {

                ans = a;
                break;
            }
        }

        return ans;

    }
}
