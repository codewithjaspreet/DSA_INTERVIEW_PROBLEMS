// two pointer technique 
// O(N) time and constant space

class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int A[], int N)
    {
        // Your code here
        int max = 0;
        int curMax = 0;
        
        for(int i = 0 ; i <N-1 ; i++){
            
            if(A[i] < A[i+1] ){
                curMax++;
            }
            
            else{
                if(curMax > max){
                    max = curMax;
                    
                }
                curMax = 0;
            }
        } 
        
        max = Math.max(max , curMax);
        return max;
    }
    
}