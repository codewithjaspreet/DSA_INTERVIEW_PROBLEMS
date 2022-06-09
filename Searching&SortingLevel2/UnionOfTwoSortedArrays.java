// brute force - hashset  nlogn

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code 
        // int[] temp = mergeTwoSortedArrays(arr1 , arr2, n , m);
        HashSet<Integer> map = new HashSet<>();
        
        for(int a : arr1) {
            map.add(a);
        }
    
        
        for(int a: arr2){
            map.add(a);
        }
        ArrayList<Integer> f = new ArrayList<>(map.size());
        int[] ans = new int[map.size()]; int i = 0;
        for(int a : map){
            ans[i]  = a;
            i++;
        }
        
        Arrays.sort(ans);
        
        for(int a : ans){
            f.add(a);
        }
        
        return f;
        
    }
    
 
}
