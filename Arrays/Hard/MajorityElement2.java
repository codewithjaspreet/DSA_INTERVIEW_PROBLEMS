// brute force , time complexity O(n) , space complexity O(1) , auxillary space O(n)
class Solution {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : nums) {

            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (int a : map.keySet()) {

            if (map.get(a) > nums.length / 3) {

                ans.add(a);

            }
        }

        return ans;

    }
}