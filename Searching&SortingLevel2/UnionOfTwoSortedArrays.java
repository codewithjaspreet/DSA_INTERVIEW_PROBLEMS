class Solution
{
    // O(N+M) - optimised
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i = 0 ; int j = 0;
        
       while (i < n && j < m) {
      if (arr1[i] == arr2[j]) {

        if (ans.size() > 0 && ans.get(ans.size() - 1) != arr1[i]) {
          ans.add(arr1[i]);
        }

        else if (ans.size() == 0) {
          ans.add(arr1[i]);
        }

        i++; j++;
      }
      else if (arr1[i] < arr2[j]) {

        if (ans.size() > 0 && ans.get(ans.size() - 1) != arr1[i]) {
          ans.add(arr1[i]);

        }
        else if (ans.size() == 0) {
          ans.add(arr1[i]);
        }

        i++;
      }
      else {
          
        if (ans.size() > 0 && ans.get(ans.size() - 1) != arr2[j]) {
          ans.add(arr2[j]);

        }

        else if (ans.size() == 0) {
          ans.add(arr2[j]);
        }

        j++;

      }
    }

    while (i < n) {
      if (ans.get(ans.size() - 1) != arr1[i]) {
        ans.add(arr1[i]);
      }
      i++;
    }

    while (j < m) {
      if (ans.get(ans.size() - 1) != arr2[j]) {
        ans.add(arr2[j]);
      }
      j++;
    }

    return ans;
}
}





// // brute force - hashset  nlogn

// class Solution
// {
//     //Function to return a list containing the union of the two arrays.
//     public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
//     {
//         // add your code 
//         // int[] temp = mergeTwoSortedArrays(arr1 , arr2, n , m);
//         HashSet<Integer> map = new HashSet<>();
        
//         for(int a : arr1) {
//             map.add(a);
//         }
    
        
//         for(int a: arr2){
//             map.add(a);
//         }
//         ArrayList<Integer> f = new ArrayList<>(map.size());
//         int[] ans = new int[map.size()]; int i = 0;
//         for(int a : map){
//             ans[i]  = a;
//             i++;
//         }
        
//         Arrays.sort(ans);
        
//         for(int a : ans){
//             f.add(a);
//         }
        
//         return f;
        
//     }
    
 
// }
