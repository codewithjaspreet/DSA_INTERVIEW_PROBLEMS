package BasicRecursionProblems;

import java.util.Scanner;

public class Print1toNBacktracking {

    public  static  void Print1tONBacktrack(int  i, int n){

        if (i < 1) return;

        Print1tONBacktrack(i- 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Print1tONBacktrack(n, n);


    }
}
