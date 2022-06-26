package BasicRecursionProblems;

import java.util.Scanner;

public class PrintNto1Backtracking {

    public  static  void PrintNtO1Backtrack(int i , int n){

        if(i > n)return;

        PrintNtO1Backtrack(i+1 ,n);
        System.out.print(i + " ");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        PrintNtO1Backtrack(1, n);


    }
}
