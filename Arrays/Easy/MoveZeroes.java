
// move zeroes to the end of the array
// time complexity O(n) , space complexity O(1)
class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = 0;

        while (j < nums.length) {

            if (nums[j] != 0) {
                swap(i, j, nums);
                i++;
                j++;
            }

            else {

                j++;

            }

        }

    }

    void swap(int i, int j, int[] nums) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}