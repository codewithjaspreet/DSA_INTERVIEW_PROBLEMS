

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        
        int max = Integer.MIN_VALUE ;
        
        // find max value of array  , i.e maximum 
        
        for(int a : piles) {
            
            max = Math.max(a,max);
            
        }
            

        if(h == piles.length) return  max;  // means u can spend 1 hr on each pile 
        
        
        // binary search on answer
        
        int low = 0 ; int high = max;
        
        int speed = Integer.MAX_VALUE;
        
        
        while(low <= high){
            
            int sp = low + (high - low) /2 ;
            
            if(isPossible(piles,sp,h) == true){   
         
         // check if within h hr with sp speed is it possible to eat all bananas
                
                speed = sp; high = sp - 1;   // explore more small speed
            }
            else{
                low = sp  + 1;      // explore more high speed
            }
            
        }
        
        return speed;
    }
    
    
    public static boolean isPossible(int[] piles , int sp , int h ){
        
        int time = 0;
        
        for(int i = 0 ; i < piles.length ; i++){
            
            time+= (int)Math.ceil(piles[i]*1.0 /sp);    
            
            // math.ceil 
            // for ex ->   7 bananas u have 3 hr  acc to ques it should take 3 hr
            // normal division will give it 2 so to take upper value we take ceil of it
            
            
        }
        
        return time <= h;
    }
}

