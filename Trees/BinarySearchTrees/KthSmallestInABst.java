
/// nlogn time solution
// aux space of o(n)

class Solution {
    public int kthSmallest(TreeNode root, int k) {

        ArrayList<Integer> ans = new ArrayList<>();

        helper(ans, root);

        int[] arr = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {

            arr[i] = ans.get(i);
        }

        Arrays.sort(arr);

        return arr[k - 1];
    }

    public static void helper(ArrayList<Integer> ans, TreeNode root) {

        if (root == null)
            return;

        ans.add(root.val);

        helper(ans, root.left);

        helper(ans, root.right);

    }
}

// optimsed
// time - o(n)
// space - o(1)
//
class Solution {

    int count = 0;
    int result = Integer.MIN_VALUE;

    public int kthSmallest(TreeNode root, int k) {
        Inorder(root, k);
        return result;
    }

    /* For kth smallest element */
    void Inorder(TreeNode root, int k) {
        if (root == null)
            return;
        Inorder(root.left, k);
        count++;
        if (count == k)
            result = root.val;
        /*
         * NO need to visit the right tree if count is already greater than k, if
         * count>k that means we already found K
         */
        if (count < k)
            Inorder(root.right, k);
    }

}