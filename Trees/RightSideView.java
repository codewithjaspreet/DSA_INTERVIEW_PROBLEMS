
// recursive pre order 
// time = o(n) , space  - o(height of tree)
class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();

        rightUtil(root, ans, 0);

        return ans;
    }

    void rightUtil(TreeNode node, ArrayList<Integer> ans, int level) {

        if (node == null)
            return;

        if (ans.size() == level) {

            ans.add(node.val);
        }

        rightUtil(node.right, ans, level + 1);
        rightUtil(node.left, ans, level + 1);

    }
}