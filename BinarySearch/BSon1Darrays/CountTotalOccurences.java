// linear search
// time complexity is O(n)
class Solution {

    public int solve(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == k)
                count++;
        }
        return count;
    }
}

// binary search
// time complexity is O(logn)
class Solution {
    int count(int[] nums, int n, int k) {

        int low = 0;
        int high = nums.length - 1;
        int first = -1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == k) {
                first = mid;
                high = mid - 1;
            } else if (nums[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == k) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (first == -1 && last == -1)
            return 0;
        else
            return last - first + 1;

    }
}