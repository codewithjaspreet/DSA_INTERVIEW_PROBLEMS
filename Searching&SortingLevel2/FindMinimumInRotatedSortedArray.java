// one simple solution ->  intent is to apply binary search here and have the benefit of sorted array
// class Solution {
//     public int findMin(int[] nums) {
        
//         int min = Integer.MAX_VALUE;
        
//         for(int a : nums){
            
//             if(a < min){
//                 min = a;
//             }
//         }
        
//         return min;
        
        
       
//     }
// }

// optimised logn solution

class Solution {
    public int findMin(int[] nums) {
       
     int lo = 0;
        int hi = nums.length-1;
        
        if(nums[lo] <= nums[hi]) {
            //numsay is not rotated at all
            return nums[lo];
        }
        
        while(lo <= hi) {
           int mid = (lo + hi)/2;
           
           if(nums[mid] > nums[mid+1]) {
               return nums[mid+1];
           }
           else if(nums[mid] < nums[mid-1]) {
               return nums[mid];
           }
           else if(nums[lo] <= nums[mid]) {
               lo = mid+1;
           }
           else if(nums[mid] <= nums[hi]) {
               hi = mid-1;
           }
        }
        
        return -1;

 
    }
}