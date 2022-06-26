package BasicRecursionProblems;

import java.util.Scanner;

public class PrintLinearlyFrom1toN {

    public  static void oneToN(int n  , int i){

        if(i  > n) return;

        System.out.print(i);

        oneToN(n , i+1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        oneToN(n ,1 );

    }
}
