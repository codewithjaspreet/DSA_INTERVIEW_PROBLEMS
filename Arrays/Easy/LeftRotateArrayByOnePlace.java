
// part 1 reverse the part of array from 0 to len- k -1
// part 2 reverse the part of array from len - k to len - 1
// part 3 reverse the whole array

class Solution {

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        if (k < 0)
            k += nums.length;

        reverse(0, nums.length - k - 1, nums);

        reverse(nums.length - k, nums.length - 1, nums);

        reverse(0, nums.length - 1, nums);

    }

    static void reverse(int i, int j, int[] nums) {

        int left = i;
        int right = j;

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

    }

}