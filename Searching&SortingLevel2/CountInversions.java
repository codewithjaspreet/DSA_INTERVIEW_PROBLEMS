
// brute force   ->  time limit  exceeded for bigger values

// class Solution
// {
//     // arr[]: Input Array
//     // N : Size of the Array arr[]
//     //Function to count inversions in the array.
//     static long inversionCount(long arr[], long N)
//     {
//         // Your Code Here
//         int Ic  = 0 ;
        
//         for(int  i = 0  ; i < N ; i++){
            
//             for(int j = i ;  j < N ; j++){
            
//                if(arr[i]  > arr[j] && i<j) Ic++;    
//             }
            
            
//         }
        
//         return Ic;
//     }
// }

// optimised - nlogn approach using merge sort 

class Solution
{
   // arr[]: Input Array
   // N : Size of the Array arr[]
   //Function to count inversions in the array.
   static long inversionCount(long arr[], long N)
   {
      long temp[] = new long[(int)N];
      return mergeSort(arr,temp,0,N-1);
   }
   static long mergeSort(long arr[],long temp[], long left, long right){
       long count = 0;
       long mid;
       if(left < right){
           mid = (left+right)/2;
           count += mergeSort(arr,temp,left,mid);
           count += mergeSort(arr,temp,mid+1,right);
           
           count += merge(arr,temp,left,mid+1,right);
       }
       return count;
   }
   static long merge(long arr[],long temp[],long left, long mid, long right){
       long i = left;
       long j = mid;
       long k = left;
       long count = 0;
       while(i <= mid-1 && j <= right){
           if(arr[(int)i] <= arr[(int)j]){
               temp[(int)k++] = arr[(int)i++];
           }
           else{
               temp[(int)k++] = arr[(int)j++];
               count += mid-i;
           }
       }
       while(i <= mid-1){
           temp[(int)k++] = arr[(int)i++];
       }
       while(j <= right){
           temp[(int)k++] = arr[(int)j++];
       }
       for(i = left; i <= right; i++){
           arr[(int)i] = temp[(int)i];
       }
       return count;
   }
}