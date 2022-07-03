//subsets  - I , pick not pick 

// time  - O(2^N) ,
// space  - O(2^N),

public class Subsets {

}

class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        helper(0, nums, temp, ans, nums.length);

        return ans;

    }

    public static void helper(int index, int[] nums, List<Integer> temp, List<List<Integer>> ans, int N) {

        if (index == N) {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }

        temp.add(nums[index]);

        helper(index + 1, nums, temp, ans, N);

        temp.remove(temp.size() - 1);

        helper(index + 1, nums, temp, ans, N);

    }

}