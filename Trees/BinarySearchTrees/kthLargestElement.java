
// concept - reverse inorder
//right root left

class Solution {
    int count = 0;
    int result = Integer.MIN_VALUE;

    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int K) {
        // Your code here
        Inorder(root, K);
        return result;

    }

    void Inorder(Node root, int k) {
        if (root == null)
            return;
        Inorder(root.right, k);
        count++;
        if (count == k)
            result = root.data;
        /*
         * NO need to visit the right tree if count is already greater than k, if
         * count>k that means we already found K
         */
        if (count < k)
            Inorder(root.left, k);
    }

}