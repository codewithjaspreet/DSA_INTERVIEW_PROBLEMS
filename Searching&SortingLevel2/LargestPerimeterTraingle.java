// O(N) solution

//  s1 + s2 > s3    ( s1 < s2 < s3)  when this

// for a valid traingle sum of any two sides should be greater than than the third side
class Solution {
    public int largestPerimeter(int[] nums) {
        
       Arrays.sort(nums); 
        
      int peri  = 0;
        
      for(int i = nums.length - 1 ;  i >=2 ; i--){
          
          if(nums[i-1] + nums[i-2]  > nums[i]){
              peri = nums[i] + nums[i-1] + nums[i-2];
              break;
          }
      }
        
        return peri;
    }
}