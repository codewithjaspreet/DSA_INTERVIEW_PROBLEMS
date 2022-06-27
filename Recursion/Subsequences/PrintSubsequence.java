package Subsequences;

import java.util.ArrayList;
import java.util.Scanner;

// time complexity - 2^n * n;
// space  = O(N) at max at a moment in the stack pace
public class PrintSubsequence {

    public static  void  PrintF(int[] arr , int i  , ArrayList<Integer> ans){

        if (i == arr.length) {
            System.out.println(ans);
            return;
        }
        ans.add(arr[i]);// add to array list

        PrintF(arr, i+1, ans);  // pick an element

        ans.remove(ans.size()-1);// remove from array list

        PrintF(arr, i+1, ans);// not pick

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = {3,1,2};
        int n = 3;
        ArrayList<Integer> ans = new ArrayList<>();

        PrintF(arr , 0  , ans);
    }
}
