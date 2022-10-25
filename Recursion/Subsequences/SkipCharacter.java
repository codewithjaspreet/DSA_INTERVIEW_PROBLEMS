import java.util.Scanner;

// skip a character in a string
class Solution {

    public static void skipCharacre(String up, String p, char x) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);

        if (ch == x) {
            skipCharacre(up.substring(1), p, x);
        } else {
            skipCharacre(up.substring(1), p + ch, x);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextLine();
        String str = s.nextLine();
        System.out.println(subsequence(str));
    }
}