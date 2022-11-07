
class Solution
{
    int count = 0;
    void solve(Node root, int k, ArrayList<Integer>path) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        
        int sum =0;
        for(int i = path.size()-1; i>=0; i--){
            sum += path.get(i);
            if(sum == k)
            count++;
        }
        solve(root.left, k, path);
        
        solve(root.right, k, path);
        path.remove(path.size()-1);
    }
    
    
    public int sumK(Node root,int k)
    {
        // code here 
        ArrayList<Integer> path = new ArrayList<>();
        
        solve(root, k, path);
        return count;
    }
}