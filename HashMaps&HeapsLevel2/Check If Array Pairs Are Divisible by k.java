
class Solution {
    public boolean canArrange(int[] arr, int k) 
    {
        if(arr.length % 2 != 0)
            return false;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++)
        {
            int rem = arr[i] % k;
            if(rem < 0)
                rem = rem + k;
            
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        
        for(Integer i: map.keySet())
        {
            if(i == 0)
            {
                if(map.get(i) % 2 !=0)
                    return false;
            }
            
            else if (i * 2 == k)
            {
                if(map.get(i) % 2 != 0)
                    return false;
            }
            
            else
            {
               int c1 = map.get(i);
               int c2 = map.getOrDefault(k-i, 0); 
                
               if(c1 != c2)
                   return false;
            }
        }
        return true;
    }
}
