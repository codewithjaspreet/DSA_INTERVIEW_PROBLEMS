
// time and space - O(N)


class Complete{
    
   
    // Function for finding maximum and value pair
    public static long calculate (int arr[], int n) {
        //Complete the function
        long ans = 0;
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int a : arr){
            
            if(map.containsKey(a)) map.put( a , map.get(a) + 1);
            else map.put(a , 1);
            
        }
        
        for(int a  : map.keySet()){
            
            int val = map.get(a);
            ans+= ((val-1)*val)/2;
        }
        return ans;
    }
    
    
}


