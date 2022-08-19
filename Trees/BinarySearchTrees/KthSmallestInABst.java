
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
