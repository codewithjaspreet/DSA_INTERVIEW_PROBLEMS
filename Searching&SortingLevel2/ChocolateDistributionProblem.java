
// nlogn

class Solution
{
    
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        
      // collections.sort to sort arraylist can also be used

         int ans = Integer.MAX_VALUE;
        int[] arr = new int[a.size()];
        for(int i = 0 ; i < a.size() ;i++){
            arr[i]   = a.get(i);
        }
        
        Arrays.sort(arr);
        
        for(int i = 0 ; i<=n-m ; i++){
            
            int minw  = arr[i];
            int maxw = arr[i + m -1];
            int gap= maxw - minw;
            
            ans = Math.min(gap , ans);
        }
        
        return (long)ans;
        
        
        
        
    }
}