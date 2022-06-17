
// maintain rmax;

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        int rmax  = Integer.MIN_VALUE;
        
        
        for(int i = n -1  ; i >=0 ; i--){
            
            if(arr[i] >= rmax){
                rmax = arr[i];
                ans.add(arr[i]);
            }
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}
