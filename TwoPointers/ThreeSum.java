import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {


    // method 1 - brute force- o(n3) + SPACE OF SET
    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.

		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		Set<ArrayList<Integer>> set  = new HashSet<>();

		for(int i = 0 ; i < n ;i++){

			for (int j = i + 1; j< n ; j++){

				for(int k  = j + 1 ; k < n ; k++){

					if(arr[i] + arr[j] + arr[k] == K){

						ArrayList<Integer> temp = new ArrayList<>();
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[k]);
						Collections.sort(temp);

						set.add(temp);
					}
				}

			}
		}

		for(ArrayList<Integer> a : set){

			ans.add(a);
		}

		return ans;
    }

        public List<List<Integer>> threeSum(int[] nums) {
            
            List<List<Integer>> res = new ArrayList<>();
            int n = nums.length;
            
            if(n < 3){
                return res;
            }
            
            Arrays.sort(nums);
            
            for(int i  = 0 ; i <= n - 3 ; i++){
                
                if(i !=0 && nums[i] == nums[i-1]) continue;
                
                int val1 = nums[i];
                int targ = 0  - val1;
                List<List<Integer>> subres = twoSum(nums  , i+1, n -1 , targ);
                
                // impact of val1 in these pairs
                
                for(List<Integer> list  : subres){
                    list.add(val1);
                    res.add(list);
                    
                }
            }
            return res;
        }
        
        public List<List<Integer>> twoSum(int[] nums , int s1 , int e1 , int target){
            
            int left = s1;
            int right = e1;
            List<List<Integer>> res = new ArrayList<>();
            int n = nums.length;
            
            while(left<right){
                if(left != s1 && nums[left] == nums[left - 1]){
                    left++; continue;
                }
                int sum = nums[left] + nums[right];
                
                if(sum == target) {
                    List<Integer> subres = new ArrayList<>();
                    subres.add(nums[left]);
                    subres.add(nums[right]);
                     res.add(subres);
                    left++; right--;
                    
                }
                
                else if(sum  > target) right--;
                
                else left++;
                
            }
            
            return res;
            
            
    
            }
        
        }
    
    

