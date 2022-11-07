// approach 1 - o(n) time and o(n) space
// inorder of a bst is sorted
class Solution {
    
    public boolean isValidBST(TreeNode root) {

        ArrayList<Integer> arr = new ArrayList<>();    
        helper(root,arr);

        int[] ans = new int[arr.size()];

        for(int i = 0 ; i < arr.size() ; i++){

            ans[i] = arr.get(i);
        }

        for(int i = 1 ; i < ans.length ; i++){

            if(ans[i] <=  ans[i-1]  ) {

                return false;
            }
        }

        return true;
    }

    static void helper(TreeNode node ,  ArrayList<Integer>  arr){

        if(node == null){

            return;
        }

        helper(node.left , arr);
        arr.add(node.val);
        helper(node.right , arr);


    }
}

// optimised approach

class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val >= max || root.val <= min) return false;

        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }
}

// TC: O(n), SC: O(h)