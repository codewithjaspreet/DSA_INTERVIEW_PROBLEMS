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

    // skip a entire string "apple"

    public static String skipString(String up) {

        if (up.length() == 0)
            return "";

        char ch = up.charAt(0);

        if (up.startsWith("apple")) {

            return skipString(up.substring(5));
        }

        else {
            return ch + skipString(up.substring(1));
        }
    }

    public static String skipappNotApple(String up) {

        if (up.length() == 0)
            return "";

        char ch = up.charAt(0);

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipappNotApple(up.substring(3));
        } else {
            return ch + skipappNotApple(up.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextLine();
        String str = s.nextLine();
        System.out.println(subsequence(str));
    }
}