// follow up 2sum - 3 sum - 4 sum

class Solution {

    public List<List<Integer>> twosum(int[] nums, int si, int target) {

        List<List<Integer>> res = new ArrayList<>();
        int left = si;
        int right = nums.length - 1;

        if (nums.length - si < 2) {
            return res;
        }
        while (left < right) {

            if (left != si && nums[left] == nums[left - 1]) {
                ++left;
                continue;
            }

            int sum = nums[left] + nums[right];

            if (sum == target) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(nums[left]);
                list.add(nums[right]);
                res.add(list);
                ++left;
                --right;
            } else if (sum < target) {
                ++left;
            } else {
                --right;
            }
        }

        return res;
    }

    public List<List<Integer>> threesum(int[] nums, int si, int target) {

        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length;

        if (n - si < 3) {
            return res;
        }

        for (int i = si; i <= n - 3; i++) {

            if (i != si && nums[i] == nums[i - 1]) {
                continue;
            }
            int val = nums[i];

            List<List<Integer>> subAns = twosum(nums, i + 1, target - val);

            for (List<Integer> list : subAns) {
                list.add(val);
                res.add(list);
            }
        }
        return res;
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length;
        Arrays.sort(nums);

        if (n < 4) {
            return res;
        }

        for (int i = 0; i <= n - 4; i++) {

            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int val = nums[i];

            List<List<Integer>> subAns = threesum(nums, i + 1, target - val);

            for (List<Integer> list : subAns) {
                list.add(val);
                res.add(list);
            }
        }
        return res;
    }
}