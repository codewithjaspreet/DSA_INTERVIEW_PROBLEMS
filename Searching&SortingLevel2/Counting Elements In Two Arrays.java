// naive approach - O(N^2) // TLE

class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       ArrayList<Integer> ans  = new ArrayList<>();
       HashMap<Integer,Integer>  map = new HashMap<>();
       
       int count = 0;
       for(int a : arr1){
           
           for(int b : arr2){
               
               if(b <= a){
                   count++;
               }
           }
           ans.add(count);
           count = 0;
       }
       
      return ans;
    }
    
}

// better approach  N*LogM , N - size of first array  ,  M- size of second array 

class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       ArrayList<Integer> ans  = new ArrayList<>();
       
       int count = 0;
       Arrays.sort(arr2);
       
       for(int i = 0 ; i < arr1.length ;i++){
           
           int low = 0 ; int high = arr2.length-1;
           
           while(low<=high){
               
               int mid = (low+high)/ 2;
               
               if(arr2[mid] <= arr1[i]){
                   count+=mid-low+1;
                   low = mid + 1;
                   
               }
               else{
                   high  = mid - 1;
               }
           }
           ans.add(count);
           count = 0;
       }
       
      return ans;
    }
    
}