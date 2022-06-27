package Subsequences;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubsequenceWithSumK {

    public static void helper(int[] arr , int i , ArrayList<Integer> ans ,int sum , int k){

        if(i == arr.length){
            if (sum == k){
                System.out.println(ans);
                return;
            }
            return;
        }
        ans.add(arr[i]);
        sum+=arr[i];
        helper(arr , i +1 , ans , sum , k);
        ans.remove(ans.size() - 1);
        sum -= arr[i];
        helper(arr , i+1 , ans , sum , k );
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[]arr = {1,2,1};
        int k = 2;
        ArrayList<Integer> ans = new ArrayList<>();
        helper(arr  , 0 , ans  , 0, k);

    }
}

