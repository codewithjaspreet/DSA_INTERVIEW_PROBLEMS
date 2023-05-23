import java.util.HashMap;

public class countpairs_sum_divisible_by_k {
    
    public static long countKdivPairs(int arr[], int n, int k)
    {
        //code here
        
       HashMap<Integer, Integer> remainderMap = new HashMap<>();
       long count = 0;

        for (int num : arr) {
            int remainder = num % k;
            int complement = (k - remainder) % k;

            if (remainderMap.containsKey(complement)) {
                count += remainderMap.get(complement);
            }

            remainderMap.put(remainder, remainderMap.getOrDefault(remainder, 0) + 1);
        }

        return count;
        
        
    }
}

