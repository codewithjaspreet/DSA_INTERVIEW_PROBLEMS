import java.util.*;

class EvenOddTree {

  class TreeNode {
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
  }
 
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null)
            return false;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int level = 0, prev = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(level%2==0 && (curr.val%2==0 || (i>0 && curr.val<=prev))) //even 
                    return false;
                if(level%2!=0 && (curr.val%2!=0 || (i>0 && curr.val>=prev))) //odd
                    return false;
                prev=curr.val;
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            level++;
        }        
        return true;
    }
}
}
   

 