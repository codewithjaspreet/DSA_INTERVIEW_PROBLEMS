public class ContainerWithMostWater {
    

    public int maxArea(int[] height) {

        int maxArea = Integer.MIN_VALUE;


        for(int i = 0 ; i < height.length  ; i++){

            for(int j = i + 1 ; j < height.length ; j++){

                int h = Math.min(height[i] , height[j]);

                maxArea = Math.max(maxArea, h* j - i);
            }
        }

        return maxArea;
    }


    // optimised

        public int maxAreaOptimised(int[] height) {
            
    int len = height.length;
            int left = 0;
            int right = len - 1;
            int max = Math.min(height[left], height[right]) * (right - left);
            while (left < right) {
                // Move the shorter lines each time
                if (height[left] <= height[right]) {
                    left++;
                } else {
                    right--;
                }
    
                // update the max area
                max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            }
    
            return max;
        }




}
