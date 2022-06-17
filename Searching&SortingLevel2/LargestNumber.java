// WE CANT RELY ON ARRAYS Sort as it will give lexographically
// but we need to apply comparator  

class Solution {
    public String largestNumber(int[] nums) {
        
        StringBuilder ans = new StringBuilder();
        String[] arr = new String[nums.length];
        
        for(int i = 0 ; i< nums.length  ;i++) {
            
            arr[i] = nums[i] + "";
            
        }
    
        Arrays.sort(arr ,(a,b) ->{
            
            Long n1 = Long.parseLong(a+b);
            Long n2 = Long.parseLong(b+a);
            
            
            if(n1 > n2) return 1;
            
            if(n2 > n1) return -1;
            
            else return 0;
            
        });
        
        
        for(int i  = arr.length - 1 ; i >=0 ; i--){
            ans.append(arr[i]);
        }
        
        if(ans.charAt(0) == '0') return "0";
        
        return ans.toString();
        
        
    }
}