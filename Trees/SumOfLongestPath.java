class SumOfLongestPath{

    int maxSum=0; //to store the max sum
    int maxLen=Integer.MIN_VALUE; //to store the max length

    void solve(Node root, int sum, int len){
        //base case
        if(root==null){
            //if new length is greater than maxlength
            if(len > maxLen){
                maxLen = len;
                maxSum = sum;
            }else if(len == maxLen){
                //if new length is equals to maxlength
                maxSum = Math.max(sum, maxSum);
            }
            return;
        }

        sum += root.data; //adding the data to sum

        solve(root.left, sum, len+1); //move left
        solve(root.right, sum, len+1);
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        int sum=0;
        int len=0;

        solve(root, sum, len);
        return maxSum;
    }

}