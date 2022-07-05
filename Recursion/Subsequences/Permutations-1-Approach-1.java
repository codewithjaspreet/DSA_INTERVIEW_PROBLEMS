
// extra space pick not pick 
// time complexity - n! * n;
// space  - >  O(N) 

class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        boolean freq[] = new boolean[nums.length];

        getAnswer(nums, ans, temp, freq);

        return ans;

    }

    public static void getAnswer(int[] nums, List<List<Integer>> ans, List<Integer> temp, boolean[] freq) {
        if (temp.size() == nums.length) {

            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!freq[i]) {

                freq[i] = true;
                temp.add(nums[i]);
                getAnswer(nums, ans, temp, freq);
                temp.remove(temp.size() - 1);
                freq[i] = false;
            }
        }

    }

}