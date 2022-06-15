// brute force - o(n^2) double nested

// better

public static int search(int A[], int N)
    {
        // your code here
        
        int ans = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int a : A){
            
            if(map.containsKey(a)) map.put(a ,map.get(a) +1);
            else map.put(a ,1);
        }
        
        for(int a : map.keySet()){
            if(map.get(a) == 1) {
              ans = a;
              break;
            }
        }
        return ans;
    }

    // optimised logn binary search approach ->


    // the idea is to move in that side where odd no of people lie
    class Sol {
    public static int search(int A[], int N)
    {
        // your code here
        int low = 0 ; int high= N-1;
        int ans = -1;
        
        // safety checks for fisrt element  , last element and if there is only 1 element
        if(A.length == 1) return A[0];
        if(A[0] != A[1]) return A[0];
        if(A[N-1] !=A[N-2]) return A[N-1];
        
       while(low <=high){
           
           int mid = (low + high)/2;

           // if left and right side both are not equa; then the ans is this as it is single element


           if(A[mid] != A[mid-1] && A[mid] != A[mid+1] ){
             
               return A[mid];
           }

           else if(A[mid] == A[mid-1]){
               
               int count = (mid - low + 1);
               
               // low to mid how many numbers are there

               if(count %2 == 0 ) low = mid + 1;

                // if even then that single element will wont be in this area
               else high = mid - 2; 
               
               // if not even than this ,  and ** put directly to mid -2 as we are done with mid - 1
           }
           else if(A[mid] == A[mid+1]){
               
               int count = (high - mid + 1); // high to mid how many numbers are there

               if(count % 2 == 0) high = mid - 1;
               
               // if even then that single element will wont be in this area
               
               else low = mid +2; 

               // else this as we are already done with mid + 1 check;

           }
       }
       
       return -1;
    }
    

}