/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

 // again similar to first index

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        
        int low = 0 ; int high = n; int ans = -1;
        
        while(low<=high){
            
            int mid = low + (high-low)/2;
            
            if(guess(mid)  == 0){
                ans = mid;
                return mid;
            }
            else if(guess(mid) == -1){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return ans;
    }
}