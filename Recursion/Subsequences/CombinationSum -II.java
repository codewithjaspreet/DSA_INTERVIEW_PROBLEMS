
// brute force give time limit exceeded

// combination with array sorting and hashset

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {


        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(candidates);
        helper(0 , candidates , ans, target , new ArrayList<>());



        List<List<Integer>> op = new ArrayList<>();


        for(List a:ans) {

            op.add(a);



        }

        return op;

    }

    public static void helper(int i , int[] arr ,    HashSet<List<Integer>> ans , int target ,    List<Integer> ds ){


        if(i == arr.length ){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[i] <= target){

            ds.add(arr[i]);
            helper(i + 1 , arr , ans , target  - arr[i] , ds);
            ds.remove(ds.size() -1);
        }

        helper(i + 1 , arr , ans , target , ds);




    }


}