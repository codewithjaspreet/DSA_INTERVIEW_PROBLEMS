// This question follows the pattern of finding subset / subsequence using recursion

 //  Each digit represent a String mapped to it
 //  so i used a integer array of size 10 ,  (you can also use a hashmap)
 
 // To try every possible combination  , concept of Backtracking will be applied here 
 
// refer the image below , might not be that much clear tho , but the recursive tree would look like  this 

https://drive.google.com/file/d/1nnLfoJWubQNv7hL8I52XPpHqpdCfVn5o/view?usp=sharing

class Solution {

	public List<String> letterCombinations(String digits) {



		ArrayList<String> ans = new ArrayList<>();

		if(digits.length() == 0) return ans;

		String[] mapping = {"" , "" , "abc" ,"def" ,"ghi" ,"jkl", "mno" ,"pqrs" ,"tuv" ,"wxyz"};

		int index = 0;

		StringBuilder  output  = new StringBuilder();

		helper(digits , output , index , ans , mapping);

		return ans;

	}

	static void helper(String digits , StringBuilder output , int index , ArrayList<String> ans , String[] mapping){


		// base case 

		if(index  >= digits.length()){

			String base = output.toString();
			ans.add(base);

			return;
		}

		int ch = digits.charAt(index) - '0';

		String val = mapping[ch];

		for(int i = 0 ; i < val.length() ; i++){

			output.append(val.charAt(i));

			helper(digits,output , index + 1  , ans , mapping);

			output.deleteCharAt(output.length() - 1);

		}

	}
}