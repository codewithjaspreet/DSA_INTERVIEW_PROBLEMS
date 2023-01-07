public class MinStepstomakeAnagramII {
    
    public int minSteps(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            ++cnt[s.charAt(i) - 'a'];
        }
        for (int i = 0; i < t.length(); ++i) {
            --cnt[t.charAt(i) - 'a'];
        }
        int minSteps = 0;
        for (int c : cnt) {
            minSteps += Math.abs(c);
        }
        return minSteps;
    }
}
