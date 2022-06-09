// Time - > O(N+M) types since we are discarding a particular row or column on the basis of condition

public class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
       
        int c = matrix[0].length -1 ;  int r = 0;
        
        while(c>=0 && r<=matrix.length - 1 ){
            
            if(matrix[r][c]  == target) return true;
            
            else if(matrix[r][c]  > target) c--;
            
            else r++;
        }
        
        return false;

    }

}