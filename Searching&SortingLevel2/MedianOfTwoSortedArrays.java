// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int[] nums3 = new int[nums1.length + nums2.length];
//         int i = 0;
//         int j = 0;
//         int k = 0;
        
//         while(i < nums1.length &&  j < nums2.length){
//             if(nums1[i] < nums2[j] ){
//                 nums3[k] = nums1[i];
//                 k++;i++;
                    
//             }
//             else{
//                 nums3[k] = nums2[j];
//                 k++;j++;
                    
//             }
            
            
//         }
        
//         while(i < nums1.length){
//             nums3[k] = nums1[i];
//             k++;i++;
//         }
        
//         while(j < nums2.length){
//             nums3[k] = nums2[j];
//             j++;k++;
//         }
        
//        if (nums3.length % 2 != 0)
//             return (double)nums3[nums3.length / 2];
 
//         return (double)(nums3[(nums3.length - 1) / 2] + nums3[nums3.length / 2]) / 2.0;
//     }
// }

// optimised  -> O(log(m+n))

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
    
        if(nums1.length > nums2.length){
        
        int[] temp = nums1;
        nums1 =nums2;
        nums2 = temp;
    
    
        }
        
        int low=0 ; int high = nums1.length ; int total =nums1.length+ nums2.length;
        
        while(low<=high){
            
            int aleft = (low+high)/2;
            int bleft =  (total+1)/2-aleft;
            
            int alm1 = (aleft == 0)  ? Integer.MIN_VALUE : nums1[aleft - 1];
            int al = (aleft == nums1.length) ? Integer.MAX_VALUE : nums1[aleft];
            int blm1 = (bleft == 0) ? Integer.MIN_VALUE : nums2[bleft-1];
            int bl = (bleft == nums2.length) ? Integer.MAX_VALUE : nums2[bleft];
            
            if(alm1 <=  bl && blm1 <= al){
                
                double median  = 0.0;
                
                if(total%2 == 0){
                    
                    int lmax = Math.max(alm1 , blm1);
                    int rmin = Math.min(al,bl);
                    
                    median = (lmax+rmin) /2.0;
                }
                else{
                     
                    int lmax = Math.max(alm1 , blm1);
                    median = lmax;
                }
                
                return median;
            }
            
            else if(alm1 >bl){
                
                // there are more elements  to be picked in left part 'b' array;
                
                high= aleft-1;
            }
             
            else if(blm1 >al){
                
                // there are more element to be picked in the left part from 'a' array;
                
                low = aleft + 1;
            }
            
        }
        
        return 0;

    }
}