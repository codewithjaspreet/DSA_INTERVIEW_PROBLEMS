
// brute force - O(N) time and O(N) space 
class Solution {
    int distinctCount(int[] arr, int n) {
        // code here
        
        Set<Integer> hs = new HashSet<>(); 
        
        for(int x : arr){
            hs.add(Math.abs(x));
        }
        
        return hs.size();
    }
 }

 // Optimissd - two pointers
// O(N) time and O(1) space
 
class Solution {
    int distinctCount(int[] arr, int n) {
        // code here
        int count = 0;
        int prev = Integer.MIN_VALUE;
        int next = Integer.MAX_VALUE;
        
        int i = 0 ; int j = n-1;
        while(i<=j) {
            
            if(Math.abs(arr[i]) == Math.abs(arr[j]) ){
                count++; prev = arr[i]; next  = arr[j]; 
                i++;j--;
                 
            }
            
            else if(Math.abs(arr[i]) < Math.abs(arr[j]) ) {
                if(arr[j] !=next){
                  count++;    
                }
                
                next = arr[j];
                j--;
            }
            else{
                if(arr[i] !=prev){
                  count++;    
                }
                
                prev = arr[i];
                i++;
            }
        }           
            
        
      
        
        return count;
        
    }
 }
 
