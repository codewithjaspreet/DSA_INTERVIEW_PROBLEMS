class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
      HashMap<Integer,Integer> map = new HashMap<>();
        
        int ans = 0 ; int sum = 0;
        
       for(int i =  0; i < nums.length; i++){
           
           
           sum+= nums[i];
           
           if(sum == goal) {
               
               ans++;
           }
           
           if(map.containsKey(sum - goal)){
               
               ans+= map.get(sum - goal);
           }
           
           if(map.containsKey(sum)){
               
               map.put(sum , map.get(sum ) + 1);
           }
           
           else{
               
               map.put(sum , 1);
           }
       }
        
        return ans;
        
    }
}