package BasicRecursionProblems;

import java.util.Scanner;

public class PrintNto1 {
    public  static void NtoOne(int n  , int i){

        if( n <  i) return;

        System.out.print(n);

        NtoOne(n -1, i );
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        NtoOne(n ,1 );

    }
}
