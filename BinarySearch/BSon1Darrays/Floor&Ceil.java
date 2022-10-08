class Main {
    // Function to find the ceil of `x` in a sorted array nums[],
    // i.e., the smallest integer greater than or equal to `x`
    public static int getCeil(int[] nums, int x) {
        // search space is nums[left…right]
        int left = 0, right = nums.length - 1;

        // initialize ceil to -1
        int ceil = -1;

        // loop till the search space is exhausted
        while (left <= right) {
            // find the mid-value in the search space
            int mid = (left + right) / 2;

            // if `x` is equal to the middle element, it is the ceil
            if (nums[mid] == x) {
                return nums[mid];
            }

            // if `x` is less than the middle element, the ceil exists in the
            // subarray nums[left…mid]; update ceil to the middle element
            // and reduce our search space to the left subarray nums[left…mid-1]
            else if (x < nums[mid]) {
                ceil = nums[mid];
                right = mid - 1;
            }

            // if `x` is more than the middle element, the ceil exists in the
            // right subarray nums[mid+1…right]
            else {
                left = mid + 1;
            }
        }

        return ceil;
    }

    // Function to find the floor of `x` in a sorted array nums[],
    // i.e., the largest integer less than or equal to `x`
    public static int getFloor(int[] nums, int x) {
        int left = 0, right = nums.length - 1;

        // initialize floor to -1
        int floor = -1;

        // loop till the search space is exhausted
        while (left <= right) {
            // find the mid-value in the search space
            int mid = (left + right) / 2;

            // if `x` is equal to the middle element, it is the floor
            if (nums[mid] == x) {
                return nums[mid];
            }

            // if `x` is less than the middle element, the floor exists in the left
            // subarray nums[left…mid-1]
            else if (x < nums[mid]) {
                right = mid - 1;
            }

            // if `x` is more than the middle element, the floor exists in the
            // subarray nums[mid…right]; update floor to the middle element
            // and reduce our search space to the right subarray nums[mid+1…right]
            else {
                floor = nums[mid];
                left = mid + 1;
            }
        }

        return floor;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 6, 8, 9 };

        for (int i = 0; i <= 10; i++) {
            System.out.println("Number " + i + " —> ceil is " + getCeil(nums, i)
                    + ", floor is " + getFloor(nums, i));
        }
    }
}