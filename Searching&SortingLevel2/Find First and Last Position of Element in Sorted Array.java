// O(logn)

class Solution {
    
    public int[] searchRange(int[] nums, int target) {
        
    
        int[]ans = new int[2];
        ans[0] = ans[1] = -1;

        //find first index of target
        int lo = 0;
        int hi = nums.length-1;

        while(lo <= hi) {
            int mid = (lo + hi)/2;

            if(nums[mid] == target) {
                ans[0] = mid;
                hi = mid - 1;
            }
            else if(nums[mid] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }

        //find last index of target
        lo = 0;
        hi = nums.length-1;

        while(lo <= hi) {
            int mid = (lo + hi)/2;

            if(nums[mid] == target) {
                ans[1] = mid;
                lo = mid + 1;
            }
            else if(nums[mid] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }

        return ans;
        }
        
        
    }
    
    
    
