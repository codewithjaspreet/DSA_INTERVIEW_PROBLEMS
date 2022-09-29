// same as subarray sum equals k
// change the question to find the number of subarrays with sum k
// make odd no = 1 and even no = 0
public class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0)
                nums[i] = 1;
            else
                nums[i] = 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
        }
        return ans;
    }
}
