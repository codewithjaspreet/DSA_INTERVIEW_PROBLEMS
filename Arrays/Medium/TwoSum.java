// brute force , time complexity O(n^2) , space complexity O(1)

class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    ans[0] = i;

                    ans[1] = j;

                    return ans;

                }

            }

        }

        return ans;

    }
}

// optimized , time complexity O(n) , space complexity O(n)
class Solution {
    public int[] twoSum(int nums[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {

                arr[0] = i;
                arr[1] = map.get(target - nums[i]);
                return arr;
            }

            map.put(nums[i], i);
        }

        return new int[] {};

    }
}
