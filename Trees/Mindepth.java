
import java.util.*;

class Mindepth {
    public class TreeNode {
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

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int depth = 1;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            // for each level
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }


    public int minDepthRecursion(TreeNode root) {
        if(root == null) return 0;
           
        
        int minLeft =  minDepth(root.left);
        int minRight =  minDepth(root.right);
        
        if(minLeft == 0 || minRight == 0){     // skew Tree
             
              return 1 + Math.max(minLeft, minRight);
         }
          
         return 1 + Math.min(minLeft , minRight);
            
       }
}