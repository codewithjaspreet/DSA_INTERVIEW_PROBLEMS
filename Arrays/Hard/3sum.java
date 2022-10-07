
// two sum problem two pointer approach
// time complexity O(nlogn) , space complexity O(1)
// approach - sort the array and use two pointer approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        if (n < 3) {
            return res;
        }

        Arrays.sort(nums);

        for (int i = 0; i <= n - 3; i++) {

            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            int val1 = nums[i];
            int targ = 0 - val1;
            List<List<Integer>> subres = twoSum(nums, i + 1, n - 1, targ);

            // impact of val1 in these pairs

            for (List<Integer> list : subres) {
                list.add(val1);
                res.add(list);

            }
        }
        return res;
    }

    public List<List<Integer>> twoSum(int[] nums, int s1, int e1, int target) {

        int left = s1;
        int right = e1;
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        while (left < right) {
            if (left != s1 && nums[left] == nums[left - 1]) {
                left++;
                continue;
            }
            int sum = nums[left] + nums[right];

            if (sum == target) {
                List<Integer> subres = new ArrayList<>();
                subres.add(nums[left]);
                subres.add(nums[right]);
                res.add(subres);
                left++;
                right--;

            }

            else if (sum > target)
                right--;

            else
                left++;

        }

        return res;

    }
}