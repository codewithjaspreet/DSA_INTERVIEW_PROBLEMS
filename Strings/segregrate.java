import java.io.*;
import java.util.*;

public class segregrate {

  public static int[] mergeSort(int[] arr, int lo, int hi) {
    if(lo == hi){
      int[] bans = new int[1];
      bans[0] = arr[lo];
      return bans;
    }
    int mid = (lo + hi) / 2;
    int[] lsa = mergeSort(arr,lo,mid);
    int[] rsa = mergeSort(arr,mid + 1,hi);
    int[] ans = mergeTwoSortedArrays(lsa,rsa);
    return ans;
  }

  //used for merging two sorted arrays
  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    
    
    int i = 0, j =0, k = 0;
    int[] ans = new int[a.length + b.length];
    while(i < a.length && j < b.length){
        if(a[i] <= b[j]){
          ans[k] = a[i];
          i++;
          k++;
        }else{
          ans[k] = b[j];
          j++;
          k++;
        }
    }

    while(i < a.length){
      ans[k] = a[i];
      k++;
      i++;
    }

    while(j < b.length){
      ans[k] = b[j];
      k++;
      j++;
    }
    
    return ans;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    int[] arr = {9,-3, 5,-2,-8,-6, 1, 3}
    int[] sa = mergeSort(arr,0,arr.length - 1);
    System.out.print("Sorted Array -> ");
    print(sa);
  }

}                 


                        
                        