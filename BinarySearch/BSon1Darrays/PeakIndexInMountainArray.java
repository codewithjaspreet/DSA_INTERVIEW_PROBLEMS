
// linear Search o(n)
class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        if (arr.length < 3)
            return -1;
        int ans = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > ans) {

                index = i;
                ans = arr[i];
            }
        }

        return index;
    }
}

// binary search o(logn)
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr.length < 3)
            return -1;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (mid > 0 && arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return mid;

            else if (mid > 0 && arr[mid] < arr[mid - 1])
                high = mid - 1;

            else
                low = mid + 1;
        }

        return -1;
    }
}