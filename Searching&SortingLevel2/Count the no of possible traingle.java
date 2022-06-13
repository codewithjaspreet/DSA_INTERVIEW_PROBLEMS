
//O(N^2) 

// logic of how we ensure with that if condition in while that , any two side will always be greater than the third
// also how in one iteration we make ans for many traingles  ( count+=r-l )

class Solution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
   
    {
   
            Arrays.sort(arr);
            
            int count = 0 ;
            
            for(int i = arr.length - 1 ; i >=0 ; i--){
                
                int low = 0; int right = i - 1;
                
                while(low <= right){
                    
                    
                    if(arr[low] + arr[right] > arr[i]){ 
                        
                        count+=right - low;
                        
                        right--;
                        
                    }
                    
                    else low++;
                }
            }
            
            return count;
        
    }
}


