class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
   {
       HashMap<Long,Integer> hash = new HashMap<>();
       long sum = 0; long count = 0;
       hash.put((long)0,1);
       for(int i = 0;i<n;i++){
           sum = sum + arr[i];
           if(hash.containsKey(sum)){
               count = count + hash.get(sum);
               hash.put(sum,hash.get(sum)+1);
           }
           else hash.put(sum,1);
       }
       return count;
}
    
    }
