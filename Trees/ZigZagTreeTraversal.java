import java.util.*;

public class ZigZagTreeTraversal {

    // Definition for a binary tree node.
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if(root == null){
            return ret;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        boolean flag = true;
        while(!que.isEmpty()){
            ArrayList<Integer> levelnode = new ArrayList<>();
            int len  = que.size();
            for(int i = 0; i < len; i++){
                TreeNode temp = que.poll();
                if(flag){
                    levelnode.add(temp.val);
                }else{
                    levelnode.add(0,temp.val);
                }
                if(temp.left != null) que.offer(temp.left);
                if(temp.right != null) que.offer(temp.right);
            }
            flag = !flag;
            ret.add(levelnode);
        }
        return ret;
    }

}
