// again similar to first index concept;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int low = 1 ; int high = n  ;
        
        int ans = 0;
        
        while(low <= high){
            
            int  mid = low+(high-low)/2;
            
            if(isBadVersion(mid) == true){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        
       
        return ans;
    }
    
    
}