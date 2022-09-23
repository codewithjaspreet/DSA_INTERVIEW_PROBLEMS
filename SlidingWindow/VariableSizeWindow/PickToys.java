import java.util.HashMap;
import java.util.Scanner;

// ques same as LongestSubstringwithAtMostKDistinctCharacters.java
// here k is window size and k is 2
class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(pickToys(s));
    }

    public static int pickToys(String s) {

        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < arr.length) {

            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            if (map.size() == 2) {
                max = Math.max(max, j - i + 1);
            } else if (map.size() > 2) {
                while (map.size() > 2) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0)
                        map.remove(s.charAt(i));
                    i++;
                }
            }
            j++;
        }

        return max;
    }
}