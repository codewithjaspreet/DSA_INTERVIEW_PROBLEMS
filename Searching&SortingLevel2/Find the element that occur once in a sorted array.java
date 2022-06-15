// brute force - o(n^2) double nested

// better

public static int search(int A[], int N)
    {
        // your code here
        
        int ans = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int a : A){
            
            if(map.containsKey(a)) map.put(a ,map.get(a) +1);
            else map.put(a ,1);
        }
        
        for(int a : map.keySet()){
            if(map.get(a) == 1) {
              ans = a;
              break;
            }
        }
        return ans;
    }

    // optimised logn binary search approach ->