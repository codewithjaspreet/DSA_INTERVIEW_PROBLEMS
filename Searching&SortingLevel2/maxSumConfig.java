class GfG
{
    int max_sum(int A[], int n)
    {
	// Your code here
	int sum = 0 ;
	int S0 = 0;
	
	for(int i = 0 ; i <n;i++){
	    sum+=A[i];
	    S0+=A[i]*i;
	}
	
	int max = S0;
	int si = S0;
	
	for(int i = 0 ; i < n-1;i++){
	    
	    int Sip1 = si + sum - n*A[n-i-1];   // important formula derivation 
	    
	    if(Sip1 > max){
	        max = Sip1;
	    }
	    
	    si = Sip1;
	}
	
	return max;
	
	
	
	  
	   
    }
    
    
   