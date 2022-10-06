
// brute force , time - nlogn , space - O(1)
class Solution {
    public void sortColors(int[] nums) {

        Arrays.sort(nums);
    }
}

// count sort , time - O(n) , space - O(1)
class Solution {
    public void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int a : nums) {

            if (a == 0)
                zero++;
            else if (a == 1)
                one++;
            else
                two++;
        }

        int i = 0;
        while (zero > 0) {

            nums[i] = 0;
            i++;
            zero--;
        }

        while (one > 0) {

            nums[i] = 1;
            i++;
            one--;
        }
        while (two > 0) {

            nums[i] = 2;
            i++;
            two--;
        }
    }
}

// most optimized , time - O(n) , space - O(1)
// dutch national flag algorithm

class Solution {
    public void sortColors(int[] nums) {

        int mid = 0;
        int low = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            switch (nums[mid]) {

                case 0:
                    swap(low, mid, nums);
                    low++;
                    mid++;
                    break;

                case 1:

                    mid++;
                    break;

                case 2:
                    swap(high, mid, nums);
                    high--;
                    break;
            }
        }

    }

    public static void swap(int i, int j, int[] nums) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}