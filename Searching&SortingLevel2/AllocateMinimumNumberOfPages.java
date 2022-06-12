class Solution 
{
    //Function to find minimum number of pages.
    public static boolean isPossible(int arr[], int M, int n) {

        int sum = 0,count=1;

        for(int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum > n) {

                count++; sum = arr[i];

            }

            if (count > M) return false;

        }

        return true;

    }



    public static int findPages(int[] arr, int N, int M) {

        int sum = 0,max = Integer.MIN_VALUE;

        for (int i : arr) {

            sum += i;   max = Math.max(max, i);

        }

        int low = max, high = sum,ans=0;

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (isPossible(arr, M, mid)) {

                ans = mid; high = mid - 1;

            } else {

                low = mid + 1;

            }

        }

        return ans;

    }
};