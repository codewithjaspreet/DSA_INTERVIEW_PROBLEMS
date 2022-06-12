// same as koko eating bananas

class Solution {
    
    public int smallestDivisor(int[] nums, int threshold) {    
    
          int max = Integer.MIN_VALUE;
          
          for(int a : nums)
              max = Math.max(max,a);
        
        
          if(threshold == nums.length) return max;
        
         
          int low = 1 ; int high = max; int ans = Integer.MAX_VALUE;
        
          while(low <= high){
              
              int th = low + (high - low) /2;
              
              if(isPossible(nums , th , threshold) == true) {
                  
                  ans = th;
                  high = th - 1;
              }
              else{
                  low = th + 1;
              }
          }
        return ans;
    }
    
   public static boolean isPossible(int[] nums , int th , int threshold){
       
       int d = 0;
       
       for(int  i = 0 ; i < nums.length ; i ++){
           
           d+= (int) Math.ceil(nums[i]*1.0 / th);
       }
       
       return d<= threshold;
   }
}
