import java.util.*;

class TreeRecursiveTraversals {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node() {
        }

        Node(int data) {
            this.data = data;
        }
    }

    public List<Integer> preorderTraversal(Node root) {

        List<Integer> res = new ArrayList<>();
        helper1(root, res);
        return res;

    }

    public static void helper1(Node root, List<Integer> res) {

        if (root != null) {
            res.add(root.data);
            helper1(root.left, res);
            helper1(root.right, res);

        }
    }

    public List<Integer> postorderTraversal(Node root) {

        List<Integer> res = new ArrayList<>();
        helper3(root, res);
        return res;
    }

    public void helper3(Node root, List<Integer> res) {

        if (root != null) {

            helper3(root.left, res);
            helper3(root.right, res);
            res.add(root.data);
        }
    }

    public List<Integer> inorderTraversal(Node root) {
        List<Integer> res = new ArrayList<>();
        helper2(root, res);
        return res;

    }

    public void helper2(Node root, List<Integer> res) {

        if (root != null) {
            helper2(root.left, res);
            res.add(root.data);
            helper2(root.right, res);
        }
    }

   
}