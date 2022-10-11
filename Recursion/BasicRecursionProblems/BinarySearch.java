class Solution {

    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        return binarySearch(nums, low, high, target);

    }

    static int binarySearch(int[] nums, int low, int high, int target) {

        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (nums[mid] == target)
            return mid;

        if (target > nums[mid])
            return binarySearch(nums, mid + 1, high, target);

        else
            return binarySearch(nums, low, mid - 1, target);

    }
}
