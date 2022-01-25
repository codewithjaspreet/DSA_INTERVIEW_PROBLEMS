

public class BalancedBinaryTree {
    private boolean result = true;

    public boolean isBalanced(Node root) {
        
           maxDepth(root);
           return result;
   }

    public int maxDepth(Node root) {
           if (root == null)
              return 0;
        
       int l = maxDepth(root.left);
       int r = maxDepth(root.right);
        
       if (Math.abs(l - r) > 1)
             result = false;
        return 1 + Math.max(l, r);
    }
      
 }
    
    
 