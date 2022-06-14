
// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

class Solution {
    int countBuildings(int h[], int n) {
        // code here
        
        int count = 1;
        
        int lmax =  h[0];
        for(int i = 1 ; i < n ;i++){
            
            int cur = h[i];
            if(lmax < cur) {
                count++;
                lmax = cur;
            }
            
        }
        
        return count;
    }
}