// time complexity: O(nlogn)
// space complexity: O(n)
// 1. iterate over the string and make a frequency map
// 2. make a max heap of the frequency map
// 3. make a stringbuilder and add the characters to it
// 4. return the stringbuilder
class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        StringBuilder output = new StringBuilder();

        while (!pq.isEmpty()) {
            char curr = pq.poll();
            for (int i = 0; i < map.get(curr); i++) {
                output.append(curr);
            }
        }
        return output.toString();
    }
}