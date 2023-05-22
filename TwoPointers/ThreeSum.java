import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
    
}
