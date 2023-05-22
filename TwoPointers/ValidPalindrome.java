import java.util.Scanner;

public class ValidPalindrome {


    static boolean isPalindrome(String s){


        String modifiedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0 ; int j = modifiedString.length() - 1;

        char[] ch = modifiedString.toCharArray();

         while(i < j){

             if(ch[i] != ch[j]) return false;

             else{

                 i++;
                 j--;
             }


        }

        return true;
    }
    



public static void main(String[] args) {
    Scanner s  = new Scanner(System.in);

    String inpuString = s.nextLine();

    System.out.println(isPalindrome(inpuString));
}

}