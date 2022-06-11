// same as finding minimum element in rotated sorrted array

// idea is to return the index of that minimum element because  that is the count of rotation

// time - O(logn)

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        
        
        
        int low = 0 ; int high = arr.length - 1;
        if(arr[low] <= arr[high]) return 0;
        
        while(low<=high){
            
            int mid = (low+high)/2;
            
            if(arr[mid] > arr[mid+1]) {
                
                return mid+1;
            }
            
            if(arr[mid] < arr[mid-1]) {
                
                return mid;
            }
            
            
           else if(arr[low] <= arr[mid]) {
               low = mid+1;
           }
           else if(arr[mid] <= arr[high]) {
               high = mid-1;
           }
        }
        
        return 0;
    }
}