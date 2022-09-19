class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        
        Arrays.sort(s);
        Arrays.sort(g);
        
        int i = 0 ; int j = 0; int c = 0;
        
        while(i < g.length && j < s.length){
            
            
            if(s[j] >= g[i]) {
                
                c++;
                i++;
                j++;
            }
            
            else{
                
                j++;
            }
        }
        
        
        return i;
        
     
        
        
    }
}