// two hashmap strategy 
// Time Complexity: O(n)
// Space Complexity: O(n)

// approach:
// 1. create two hashmaps
// 2. get both the strings and iterate over them
// 3. if the character is present and the value is not equal to the other string's value, return false
// 4. if the character is not present, add it to the hashmap but check if the value is present in the other hashmap, if yes, return false
// 5. if the character is not present and the value is not present in the other hashmap, add it to the hashmap
class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();

        HashMap<Character, Boolean> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {

                if (map.get(c1) != c2) {

                    return false;
                }
            }

            else {

                if (map2.containsKey(c2)) {

                    return false;
                } else {

                    map.put(c1, c2);
                    map2.put(c2, true);
                }

            }

        }

        return true;

    }
}