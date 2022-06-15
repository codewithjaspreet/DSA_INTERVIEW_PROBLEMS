
// optimised  NLogM binary Search

class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        
        int r = 0;
        int cur = 0;
        
        for(int i = 0 ; i < N ; i++){
            
            int coir = binarySearch(Mat , M , i);
            
            if(coir > cur){
                cur = coir;
                r = i;
            }
        }
        
        return r;
    }
    

    // first index  , fil = M for easy calculation process rather than  - 1 as we do usual
    
    public static int binarySearch(int[][] Mat , int M ,int row){
        
        int low  = 0; int high = M-1; int fil = M;
        while(low<=high){
            
            int mid = (low  + high) / 2;
            
            if(Mat[row][mid] == 1){
                fil= mid;
                high  =  mid - 1;
            }
            else{
                low= mid +1;
            }
        }
        
        return M - fil;
    }
}