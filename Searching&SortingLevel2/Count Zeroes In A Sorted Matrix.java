// easy brute can give TLE for large N -> O(N^2)

class GfG
{
    /*you are required to complete this method*/
    int countZeros(int A[][], int N)
    {
        // Your code here
        int ans = 0 ;
        
        for(int i = 0 ; i < N ;i++){
            
            for(int j = 0 ; j < N ;j++){
                
                if(A[i][j]  == 0) ans++;
            }
        }
        
        return ans;
    }
}

// logic same as search in 2d matrix - ii   ,  O(logn)

class GfG
{
    /*you are required to complete this method*/
    int countZeros(int A[][], int N)
    {
        // Your code here
        int r = 0 ; int c = N-1; int count  = 0;
        
        while( c>=0 &&  r<N  ){
            
            if(A[r][c] == 1){
                
                c--;
                
            }
            else{
                count+=c+1;
                r++;
            }
            
        }
        
        return count;
    }
}