// linear   search o(n)

class Solution {
    public int findMin(int[] nums) {

        int min = Integer.MAX_VALUE;
        for (int a : nums) {

            min = Math.min(min, a);
        }

        return min;
    }
}

class Solution {
    public int findMin(int[] arr) {

        // ans is 1st element of part 2;

        int low = 0;
        int high = arr.length - 1;
        if (arr[low] <= arr[high])
            return arr[0];

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] > arr[mid + 1])
                return arr[mid + 1];

            // if this is true we got the first element of part 2
            else if (arr[mid] < arr[mid - 1])
                return arr[mid];

            else if (arr[low] <= arr[mid])
                low = mid + 1;

            else if (arr[mid] <= arr[high])
                high = mid - 1;
        }

        return -1;

    }
}