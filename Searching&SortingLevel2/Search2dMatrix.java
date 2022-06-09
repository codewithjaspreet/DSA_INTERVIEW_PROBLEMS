class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      
      int r = binarySearchRow(matrix,target);
        
        if(r == -1) {
            return false;
        }
        
        //search in rth row using binary search
        boolean found = binarySearch(matrix,target,r);
        
        return found;
    }

    public static int binarySearchRow(int[][] matrix,int target) {
        int lo = 0;
        int hi = matrix.length-1;
        int lc = matrix[0].length-1;
    
        while(lo <= hi) {
           
            int mid = (lo+hi)/2;
            
            if(matrix[mid][0] <= target && matrix[mid][lc] >= target) {
                return mid;
            }
            else if(matrix[mid][0] < target) {
                lo = mid+1;
            }
            else if(matrix[mid][0] > target) {
                hi = mid-1;
            }
        }
        
        return -1;
    }
    
    public static boolean binarySearch(int[][] matrix,int target,int r) {
        
        int lo = 0;
        int hi = matrix[0].length-1;
        
        while(lo <= hi) {
            int mid = (lo+hi)/2;
            
            if(matrix[r][mid] == target) {
                return true;
            }
            else if(matrix[r][mid] < target) {
                lo = mid+1;
            }
            else {
                hi = mid-1;
            }
        }
        
        return false;
    }
}