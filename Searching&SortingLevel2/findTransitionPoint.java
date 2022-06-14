//brute  - > O(N) time and O(1)  space

class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        
        int ans = -1 ;
        
        for(int i= 0 ; i <n ;i++){
            
            if(arr[i] ==1){
                ans= i;
                break;
            }
        }
        
        return ans;
        
    }
}


// optimised  version
// Expected Time Complexity: O(LogN)
// Expected Auxiliary Space: O(1)

class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        
        int ans = -1 ;
        
        int  low  = 0 ; int high = n-1;
        
        while(low <= high){
            
            int mid = (low + high) /2;
            
            if(arr[mid] == 1){
                ans = mid;
                high = mid - 1;
            }
            else{
                
                low = mid +1;
            }
            
        }
        
        return ans;
    }
}