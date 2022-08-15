/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// time - o(n)
// space  - o(n)
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        
      
        
        Map<TreeNode,TreeNode> parent_track = new HashMap<>();
        
        markParents(root , parent_track , target);
        
          // step1- mark the parents for each node
        
        
        Map<TreeNode,Boolean> visited  = new HashMap<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(target);
        visited.put(target , true);
        
        int cur_level = 0;
        
        
        // check radially for left , right and parent 
        
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            if(cur_level == k) break;
            else cur_level++;
            
            for(int i = 0 ; i < size ; i++){
                
                TreeNode current = q.poll();
                
                if(current.left != null && visited.get(current.left) == null){
                    
                    q.offer(current.left);
                    visited.put(current.left , true);
                }
                
                 if(current.right != null && visited.get(current.right) == null){
                    
                    q.offer(current.right);
                    visited.put(current.right , true);
                }
                
                 if(parent_track.get(current) != null && visited.get(parent_track.get(current)) == null){
                    
                    q.offer(parent_track.get(current));
                    visited.put(parent_track.get(current) , true);
                }
            }
        }
        
        List<Integer> ans= new ArrayList<>();
        
        while(!q.isEmpty()){
            
            TreeNode current = q.poll();
            ans.add(current.val);
        }
        
        return ans;
        
        
    }
    
    public static void markParents(TreeNode node , Map<TreeNode ,TreeNode> parent_track  , TreeNode target){
        
        Queue<TreeNode> q = new ArrayDeque<>();
        
        q.offer(node);
        
        while(!q.isEmpty()){
            
            TreeNode current = q.poll();
            
            if(current.left != null){
                
                parent_track.put(current.left , current);
                q.offer(current.left);
            }
            
            
            if(current.right != null){
                
                parent_track.put(current.right , current);
                q.offer(current.right);
            }
        }
    }
}