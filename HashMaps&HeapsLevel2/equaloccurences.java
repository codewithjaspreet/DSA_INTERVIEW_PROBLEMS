class Solution {
    public boolean areOccurrencesEqual(String s) {
        
		// Array to save the frequency of all the 26 lowercase letters
        int[] freq = new int[26];
        
		// Increment the frequency of the current letter
		// Get the index by subtracting the ASCII value of the letter 'a' from the ASCII value of the current letter
        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }
        
		// Instead of looping over the array to get the first frequency we encounter,
		// we get the frequency of the first letter in the string (or any letter in the string, it doesn't matter)
        int prev = freq[s.charAt(0) - 'a'];
        
		// Compare non-zero frequencies to the frequency of the first letter
        for(int num: freq){
		// Return false if the current frequency is not equal to "prev"
            if(num != 0 && num != prev){
                return false;
            }
        }
        
		// If we reached here, then all the frequencies are the same
        return true;
    }
}