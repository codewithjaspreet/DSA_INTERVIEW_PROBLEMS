// O(N2) approx : optimised a the tym of DP

class PalindromicSubstrings
 {
    public int countSubstrings(String s) {
        
        int count = 0;
        
        for(int i = 0 ; i < s.length() ;i++){
            
            for(int j  = i+1 ; j<=s.length() ; j++){
                
                if(isPalindrome(s.substring(i,j))){
                    count++;
                }
                else{
                    continue;
                }
            }
        }
        
        return count;
    }
    
    boolean isPalindrome(String s){
        
        int i = 0 ; int j = s.length() -1;
        
        while(i <= j){
            
            if(s.charAt(i) == s.charAt(j)){
                i++;j--;
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}