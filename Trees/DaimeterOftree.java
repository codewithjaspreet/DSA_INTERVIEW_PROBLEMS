 // O(N **2) 
class Solution {
    
    class Node
    {
        int data;
        Node left = null, right = null;
     
        Node(int data) {
            this.data = data;
        }
    }
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        if (root == null)
            return 0;
 
        // get the height of left and right sub-trees
        int lheight = height(root.left);
        int rheight = height(root.right);
 
        // get the diameter of left and right sub-trees
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);
 
        /* Return max of following three
          1) Diameter of left subtree
          2) Diameter of right subtree
          3) Height of left subtree + height of right subtree + 1
         */
        return Math.max(lheight + rheight + 1,
                        Math.max(ldiameter, rdiameter));
        
    }
    
   static int height(Node node)
    {
        // base case tree is empty
        if (node == null)
            return 0;
 
        // If tree is not empty then height = 1 + max of
        //  left height and right heights
        return (1
                + Math.max(height(node.left),
                           height(node.right)));
    }




    // O(N)
    
        // Function to return the diameter of a Binary Tree.
        int diameter1(Node root) {
           int [] max =new int[1];
            find(root,max);
            return max[0];
        }
        
         int find(Node root, int[] res){
             if (root == null) return 0;
             
              int left = find(root.left,res);
              int right = find(root.right,res);
               res[0] = Math.max(left+right+1, res[0]);
              int temp = 1 + Math.max(left,right);
           
             
              
              return temp;
        }
    

}