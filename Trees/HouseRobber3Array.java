public class HouseRobber3Array {
    public class TreeNode {
        int val;
        TreeNode right;

        TreeNode() {
        }

        TreeNode left;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    
        // withRobberyMax, withoutRobberyAmount
        
        public static int[] rob_(TreeNode root){
            
            if(root == null){
                return new int[2];
            }
            int[] left =  rob_(root.left);
            int[] right =   rob_(root.right);
            
            int[] myans = new int[2];
            myans[0] = left[1] + root.val + right[1];
            myans[1] = Math.max(left[0] , left[1]) + Math.max(right[0] , right[1]);
            
            return myans;
            
            
        }
        
        public int rob(TreeNode root) {
            
            int[] res = rob_(root);
            return Math.max(res[0] , res[1]);
    
        }
    }

}