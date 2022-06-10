
// easy sort

class Solution{
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        
      Arrays.sort(arr);
       int i =0;
       long sum =0;
       while(i<n)
       {
           sum += (long)arr[i] * i;
           i++;
       }
       long ans = sum%1000000007;
       return (int)ans;
        
    }   
}