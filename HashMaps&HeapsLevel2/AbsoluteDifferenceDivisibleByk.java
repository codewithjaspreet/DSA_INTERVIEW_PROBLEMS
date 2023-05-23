import java.util.HashMap;

public class AbsoluteDifferenceDivisibleByk {
    

	static long countPairs(int n, int[] arr, int k) {
	    
	   
		//freq map of remainders
		
		long ans = 0;
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int a : arr){
		    
		  //  map.put(a % k, map.getOrDefault(a%k ,0) + 1);
		  
		  int rem = a % k;
		  
		  if(map.containsKey(rem)){
		      
		      
		      ans += map.get(rem);
		      map.put(rem , map.get(rem) + 1);
		  }
		  
		  else{
		      
		      map.put(rem , 1);
		  }
		  
		  
		    
		    
		}
		
		return ans;
		
		
		
		
		
		
	}


}