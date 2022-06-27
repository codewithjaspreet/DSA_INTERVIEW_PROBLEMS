package paramaterizedandFunctional;

import java.util.Scanner;

public class Palindrome {

    public static  boolean isPalindrome(String str , int  i){


        if(i >= str.length() /2) return true;


        if(str.charAt(i) != str.charAt(str.length()- i - 1)) return false;


        return  isPalindrome(str , i+1);


    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        System.out.println( isPalindrome(str , 0));
    }
}
