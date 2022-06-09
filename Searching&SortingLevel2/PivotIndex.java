// good  use od preix sum concept 

// same as middle index at leetcode

class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum  = 0 ;
        
        for(int a : nums)
            sum+=a;
        
        int lsum = 0 ; int rsum = sum ;
        
        
        for(int   i = 0 ; i<nums.length ; i++){
            
            rsum-=nums[i];
            
            if(lsum == rsum) return i;
            
            lsum+=nums[i];
        }
        
        return -1;
    }
}