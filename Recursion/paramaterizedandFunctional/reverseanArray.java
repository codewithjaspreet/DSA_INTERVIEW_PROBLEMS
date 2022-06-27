package paramaterizedandFunctional;

import java.util.Arrays;
import java.util.Scanner;

public class reverseanArray {

    public static  void reverseArray(int[] arr , int i , int j ){


        if(i >= j) return ;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            reverseArray(arr , i+1 , j-1);


    }


    // recursion using only one pointer

    public static  void reverseArrayOnePointer(int[] arr , int i ){

        int n  =arr.length;

        if(i >= n /2) return ;

            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            reverseArray(arr , i, n-i-1);


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = s.nextInt();
        }
        reverseArray(arr,0,n-1);
        System.out.println(Arrays.toString(arr)) ;

    }
}
