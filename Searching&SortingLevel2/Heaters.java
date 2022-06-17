//Math.max(nlogm , mlogm)

// NICE QUESTION with the use of finding ciel and floor of a givn value in a sorted array

class Solution {
    
    static class Pair{
        int js = - 1; 
        int jl = -1;
        
        Pair(){
            
        }
        
        Pair(int js ,int jl){
            
            this.js = js;
            this.jl = jl;
        }
    }
    
    public int findRadius(int[] houses, int[] heaters) {
        
        int ans = 0 ; Arrays.sort(heaters);
        
        for(int i = 0 ; i < houses.length ;i++){
            
            int h = houses[i];
            
            Pair p = binarySearch(heaters , h);
            
            int d1 = (p.js == -1) ? Integer.MAX_VALUE : h - p.js;
            int d2 = (p.jl == -1) ? Integer.MAX_VALUE : p.jl - h;
            
            int minD = Math.min(d1,d2);
            
            ans = Math.max(minD  , ans);
        }
        
        return ans;
    }
    
    // finding ceil and floor

    public static Pair binarySearch(int[] houses , int h){
        
        int low = 0 ; int high = houses.length - 1;
        Pair p = new Pair();
        while(low <=high){
            
            int mid = (low + high)  /2;
            
            if(houses[mid] == h){
                p.js = houses[mid] ;
                p.jl = houses[mid];
                break;
            }
            else if(houses[mid] < h){
                p.js = houses[mid];
                low = mid + 1;
            }
            else{
                p.jl  = houses[mid];
                high = mid - 1;
            }
        }
        
        return p;
    }
}