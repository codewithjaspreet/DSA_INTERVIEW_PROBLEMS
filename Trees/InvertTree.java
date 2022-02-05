public class InvertTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
        public TreeNode invertTree(TreeNode root) {
            
          if(root == null){
            return null;
          }
          
          
          else{
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
            
            root.right = left;
            root.left  = right;
            return root;
            
          }
        }
    
}
