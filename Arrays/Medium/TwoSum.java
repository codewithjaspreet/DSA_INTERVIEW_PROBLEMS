// brute force , time complexity O(n^2) , space complexity O(1)

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
