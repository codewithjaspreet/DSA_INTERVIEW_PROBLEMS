class HouseRobber3WithPair {
   
    // Pair Method
    public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
            }


    public static class HousePair{
        int withRobbery = 0;
        int withOutRobbery = 0;
        
    }
    
    public static HousePair rob_(TreeNode root){
        
        if(root == null){
            return new HousePair();
        }
        HousePair left =  rob_(root.left);
        HousePair right =   rob_(root.right);
        
        HousePair ans = new HousePair();
        
        ans.withRobbery = left.withOutRobbery + root.val + right.withOutRobbery;
        ans.withOutRobbery = Math.max(left.withRobbery , left.withOutRobbery)
            +  Math.max(right.withRobbery , right.withOutRobbery);
        
        return ans;
        
        
    }
    
    public int rob(TreeNode root) {
        
        HousePair res = rob_(root);
        return Math.max(res.withRobbery , res.withOutRobbery);

    }
}
}
