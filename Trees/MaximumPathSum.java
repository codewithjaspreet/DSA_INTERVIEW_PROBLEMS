
// travel and change approach

class Solution {
    public int maxPathSum(TreeNode root) {
        
        int[] maxi = new int[1];
        maxi[0] = Integer.MIN_VALUE;
        
        int ans = max(root , maxi);
        
        return maxi[0];
    }
    
    public static int max(TreeNode root , int[] maxi){
        
        if(root == null) return 0;
        
        
        int lsum = Math.max(0 , max(root.left, maxi));
        int rsum = Math.max(0 , max(root.right , maxi));
        
        maxi[0] = Math.max(maxi[0] , lsum + rsum + root.val);
        
        
        return root.val + Math.max(lsum , rsum);
        
        
       
    }
}