
// brute force , time complexity O(nlogn) , space complexity O(n)
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int j = 0; // Here j represents at which index the next distinct element needs to be placed

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[j] = nums[i];
                j++;
            }
        }

        return set.size();
    }
}

// two pointer approach , time complexity O(n) , space complexity O(1)
class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {

                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;

    }
}