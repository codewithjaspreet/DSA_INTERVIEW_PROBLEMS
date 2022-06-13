
// time and space was expected and is O(n^2)  & O(1)


// brute : O(n^2)  & O(N)
class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        
        int ans = 0 ;
        
        HashSet<Integer> hm = new HashSet<>();
        
        for(int a : arr){
            hm.add(a);
        }
        
        for(int i = 0 ; i < n ; i++){
            
            for(int j = i+1 ; j < n ; j++){
                
                if(hm.contains(arr[i] + arr[j])){
                    ans++;
                }
            }
        }
        
        return ans;
    }
}

// optimise   , O(N^2) , O(1) space
int countTriplet(int arr[], int n) {
    // code here
    
    int ans = 0 ;
    
     Arrays.sort(arr);
    
    for(int i = arr.length - 1 ; i >= 2 ; i--){
        
        int l  = 0 ; int r  = i -1;
        
        while(l < r){
            
            if(arr[l] + arr[r] == arr[i]){
                ans++;
                l++; r--;
            }
            else if(arr[l] + arr[r] < arr[i]){
                
                l++;
                
            }
            else{
                r--;
            }
        }
    }
    
    
    return ans;
}

