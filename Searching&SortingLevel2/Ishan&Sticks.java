
// easy hashmap

class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> square (int arr[], int n) {
        //Complete the function
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int   a : arr){
            
           map.put(a ,  map.getOrDefault(a,0) + 1);
        }
        
        int nosq = 0;
        int maxArea = 0;
        
        for(int a  : map.keySet()){
            if(map.get(a) >= 4){
                nosq =  map.get(a) / 4;
                maxArea = Math.max(maxArea , a*a);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(maxArea==0){
          ans.add(-1);
          return ans;
      }
           
        ans.add(maxArea);
        ans.add(nosq);
     
        return ans;
    }
    
    
}


