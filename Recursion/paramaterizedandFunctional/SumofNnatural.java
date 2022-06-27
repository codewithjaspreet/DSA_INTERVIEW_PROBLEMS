package paramaterizedandFunctional;

import java.util.Scanner;

public class SumofNnatural {


    // parameter way

    public static  void helper(int n  , int sum){

        if(n < 1) {
            System.out.println(sum);
            return;
        }

        helper(n- 1 , sum+n);
    }


    // functional way

    public static  int helper1(int n ){

        if(n == 0 ){
            return 0;
        }

      return   n + helper1(n-1 );
    }

    public static  int factorial(int n ){

        if(n == 0  || n==1){
            return 1;
        }

      return   n  * factorial(n-1 );
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        helper(n , 0);
        System.out.println(helper1(n));
        System.out.println(factorial(n));

    }
}
