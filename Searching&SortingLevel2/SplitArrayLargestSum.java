
// nlogn - >  minimum allocation of pages pattern

class Solution {
    public int splitArray(int[] nums, int m) {
    
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int a : nums){
            sum+=a;
            max = Math.max(a , max);
            
        }
        
        int low = max;
        int high = sum;
        int ans = 0;
        
        while(low <= high){
            
            int mid   = low + (high - low) / 2;
            if(isPossible(nums , mid , m)){
                
                ans  = mid;
                high = mid - 1;
            }
            else{
                low = mid  + 1;
            }
        }
        
        return ans;
    
    }
    
    public static boolean isPossible(int[] arr , int mid , int m){
        
        int sum = 0 ; int count = 1;
        
        for(int a : arr){
            
            sum+=a;
            
            if(sum > mid){
                
                count++; sum  = a;
            }
            
        }
        
        return count <= m;
    }
}