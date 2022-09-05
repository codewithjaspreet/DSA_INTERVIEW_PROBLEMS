
// time complexity: O(n)
// space complexity: O(1)
// largest odd number in string 
class Solution {
    public String largestOddNumber(String num) {

        // int sum = 0 ;
        for (int i = num.length() - 1; i >= 0; i--) {

            if ((int) num.charAt(i) % 2 != 0)
                return num.substring(0, i + 1);
        }

        return "";
    }
}