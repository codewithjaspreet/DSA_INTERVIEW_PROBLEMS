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

    


}
