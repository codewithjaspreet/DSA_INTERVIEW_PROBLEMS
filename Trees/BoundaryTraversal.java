
// boundary - >

// left bountdary + leaf nodes + right boundary in reverse order

// below written are all four functions

// time - O(H)

class Solution
{
    
    static void traverseLeft(Node node , ArrayList<Integer> ans){
        
        if(node == null || (node.left == null && node.right == null)) return;

        ans.add(node.data);
        if(node.left != null) traverseLeft(node.left,ans);
        else traverseLeft(node.right,ans);
    }
    static void leafTraverse(Node node , ArrayList<Integer> ans){
        
        if(node== null ) return;
        if(node.left == null && node.right == null){
           ans.add(node.data);
           return;
        } 
        
        leafTraverse(node.left  , ans);
        leafTraverse(node.right , ans);
        
    }
    
    static void rightTraverse(Node node,  ArrayList<Integer > ans){
        
         if(node == null || (node.left == null && node.right == null)) return;
         
         if(node.right != null) rightTraverse(node.right , ans);
         
         
         else rightTraverse(node.left  , ans);
         
         ans.add(node.data);
         
    }
	ArrayList <Integer> boundary(Node root)
	{
	    ArrayList<Integer> ans = new ArrayList<>();
	    
	    if(root == null) return ans;
	    
	    ans.add(root.data);
	    
	    traverseLeft(root.left , ans);
	    
	    leafTraverse(root.left , ans);
	    
	    leafTraverse(root.right , ans);
	    
	    rightTraverse(root.right   , ans);
	    
	    
	    return ans;
	}
}

