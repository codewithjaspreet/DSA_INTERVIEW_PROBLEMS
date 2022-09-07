
// check if the string is a rotation of another string
// Time Complexity: O(n) where n is the length of the string
// Space Complexity: O(n) where n is the length of the string
// approach:
// 1. create a new string by concatenating the string with itself
// 2. check if the new string contains the other string
// 3. if yes, return true, else return false

class Solution {
    public boolean rotateString(String s, String goal) {

        return s.length() == goal.length() && (s + s).contains(goal);
    }
}