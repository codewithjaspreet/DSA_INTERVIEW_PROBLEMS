// Accquire  , work & release strategy
// time O(N) ,  space = O(N)

import java.util.*;

public class Main {

	public static ArrayList<Integer> solution(int[] arr, int k) {
		//write your code here
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer , Integer> map = new HashMap<>();

		int i  = 0 ; 

		while(i <= k -2){

			map.put(arr[i] , map.getOrDefault(arr[i] , 0 ) + 1);
            i++;
		  }
		
		i--;  
		int j = -1;
		while( i < arr.length){
			i++;
			map.put(arr[i] , map.getOrDefault(arr[i] , 0 ) + 1);
			// accquire
			
			list.add(map.size()); // work

			int f = map.get(arr[j]);

			j++;
			
			if(f == 1) map.remove(arr[j]); // release

			else map.put(arr[j] , f - 1);

		}	
		return list
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		ArrayList<Integer> ans = solution(arr,k);
		for(int a : ans){
			System.out.print(a + " ");
		}
	}
}



