
// time complexity: O(n)
// space complexity: O(1)
// approach: int array of size 26 to store the count of each character in the string
// 1. iterate over the string 1 and increment the count of the character in the array
// 2. iterate over the string 2 and decrement the count of the character in the array
// 3. if the count of any character is not 0, return false
// 4. else return true
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++)
            alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet)
            if (i != 0)
                return false;
        return true;
    }
}
