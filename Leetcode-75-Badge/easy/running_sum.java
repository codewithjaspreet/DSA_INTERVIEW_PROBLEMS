public class running_sum {
    

    public int[] runningSum(int[] nums) {
        

        int[] ans = new int[nums.length];

        int prev = nums[0];
        ans[0] = prev;

        for(int i = 1 ; i < nums.length ; i++){

            ans[i] = prev + nums[i];
            prev = prev + nums[i];

        }

        return ans;

}
}
