class MorrisPreOrderTraversal {

    public static ArrayList<Integer> morrisInTraversal(TreeNode Treenode) {
        ArrayList<Integer> ans = new ArrayList<>();
        TreeNode curr = Treenode;
        while (curr != null) {
            TreeNode leftNode = curr.left;
            if (leftNode == null) {
                ans.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode rightMostNode = getRightMostNode(leftNode, curr);

                if (rightMostNode.right == null) {  // thread create
                    rightMostNode.right = curr;
                    curr = curr.left;

                } else {                    
                    rightMostNode.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }

                

            }
        }

        return ans;
    }

    public static TreeNode getRightMostNode(TreeNode leftNode, TreeNode curr) {
        while (leftNode.right != null && leftNode.right != curr) {
            leftNode = leftNode.right;

        }

        return leftNode;
    }
}