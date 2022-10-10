
// time complexity: o(n)
// space complexity: o(1)
class Solution {

    public int singleNonDuplicate(int[] arr) {

        int ans = 0;

        for (int a : arr) {

            ans ^= a;
        }

        return ans;
    }
}

// time complexity: o(n)
// space complexity: o(n)

class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int singleNonDuplicate(int[] arr) {

        for (int a : arr) {

            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (int a : arr) {

            if (map.get(a) == 1)
                return a;
        }

        return -1;
    }
}

// time complexity: o(logn)
class Solution {
    public int singleNonDuplicate(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        int n = nums.length;
        if (n == 1)
            return nums[0];

        if (nums[1] != nums[0])
            return nums[0];

        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];

            if (nums[mid] == nums[mid - 1]) {

                int lc = mid - low + 1;

                if (lc % 2 == 0)
                    low = mid + 1;

                else
                    high = mid - 2;
            }

            if (nums[mid] == nums[mid + 1]) {

                int rc = high - mid + 1;

                if (rc % 2 == 0)
                    high = mid - 1;

                else
                    low = mid + 2;
            }

        }

        return -1;

    }
}