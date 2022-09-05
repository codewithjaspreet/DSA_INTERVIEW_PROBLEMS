
// using split() method to reverse words in a string stringbuilder
// regesx "\\s+" to split string by one or more spaces
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] strArr = s.split("\\s+");
        StringBuilder ans = new StringBuilder(strArr[strArr.length - 1]);
        for (int i = strArr.length - 2; i >= 0; i--) {
            ans.append(" " + strArr[i]);
        }
        return ans.toString();
    }
}

// two pointer approach
// reverse the whole string
// reverse each word

// String res = new String();

// int n = str.length();

// int i = 0 ;

// while(i < n){

// if(i < n && str.charAt(i) == ' ') i++;

// if(i >= n) break;

// int j = i + 1;

// while(j < n && str.charAt(j) != ' ') j++;

// String sub = str.substring( i , j);

// if(res.length() == 0) res = sub;

// else res = sub + " " + res;

// i = j + 1;
// }

// return res;