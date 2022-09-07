
//
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        
        int minlen = findMinLength(strs);
        
        
        String res = "";
        char current;
        
      for (int i = 0; i < minlen; i++)
        {
            // Current character (must be same
            // in all strings to be a part of
            // result)
            current = strs[0].charAt(i);
 
            for (int j = 1; j < strs.length; j++)
            {
                if (strs[j].charAt(i) != current)
                {
                    return res;
                }
            }
 
            // Append to result
            res += (current);
        }
        
        return res;
    }
    
    
    static int findMinLength(String[] arr ){
        
        int min = arr[0].length() ;
        
        for(int i = 0 ; i < arr.length  ; i++){
            
            min = Math.min(arr[i].length()  , min);
        }
        
        return min;
    }
}