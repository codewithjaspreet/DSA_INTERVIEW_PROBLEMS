// approcah: binary search
// divide any find target lie in left or right part of array
// i.e low to mid-1 or mid+1 to high
class Solution {
    // time complexity: o(logn)
    public int search(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {

            int mid = (low + high) / 2;

            // this means low to mid part is sorted

            if (arr[mid] == target)
                return mid;
            if (arr[low] <= arr[mid]) {

                if (target >= arr[low] && arr[mid] > target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            else if (arr[mid] <= arr[high]) {

                // this means mid to high part is sorted
                if (target > arr[mid] && target <= arr[high]) {

                    low = mid + 1;
                }

                else
                    high = mid - 1;
            }

        }

        return -1;

    }
}