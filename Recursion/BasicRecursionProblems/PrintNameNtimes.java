package BasicRecursionProblems;

import java.util.Scanner;

public class PrintNameNtimes {

    public  static void PrintNames(String name , int n,int i){

        if(i > n) return;

        System.out.println(name);
        PrintNames(name ,n, i+1);


    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int n = s.nextInt();

        PrintNames(name , n, 1);
    }
}
