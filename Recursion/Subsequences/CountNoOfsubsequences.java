package Subsequences;

import java.util.ArrayList;
import java.util.Scanner;

public class CountNoOfsubsequences {


    // count of no of subsequences with sum k in an array of length n
    // just alter the code with returning format

    public static  int helper(int[] arr , int sum  , int k ,int i){

        if ( i == arr.length){

            if(sum == k){
                return  1;
            }
            else  return 0;
        }

        sum+= arr[i];

        int l  = helper(arr , sum , k , i+1);

        sum-=arr[i];

        int r  = helper(arr , sum , k , i + 1);


        return  l + r;


    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[]arr = {1,2,1};
        int k = 2;
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(helper(arr  , 0 ,    2, 0));

    }
}
