//  x - k -x
// k /2 -  even
// 0 - even

class Solution{ 
    public boolean canArrange(int[] arr, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int n : arr) {
                int rem = n % k;
                if (rem < 0) rem += k;
                map.put(rem, map.getOrDefault(rem, 0) + 1);
            }
            for (int key : map.keySet()) {
                if (key == k - key || key == 0) {if (map.get(key) % 2 != 0) return false;}
                else if (!map.get(key).equals(map.getOrDefault(k - key, 0))) return false;  // can not use == here, Integer boxed;
            }
            return true;
        }
        
    }