public class MinStepstomakeAnagramI {

    public int minSteps(String s, String t) {

        int[] res = validAnagram(s);
        int[] res1 = validAnagram(t);

        int ans = 0;

        for (int i = 0; i < 26; i++) {

            if (res1[i] < res[i]) {

                ans += res[i] - res1[i];
            }
        }

        return ans;

    }

    static int[] validAnagram(String s) {

        int[] ans = new int[26];

        for (char c : s.toCharArray()) {

            ans[c - 'a']++;
        }

        return ans;

    }
    
}
