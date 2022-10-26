import java.util.ArrayList;
import java.util.Scanner;

public class subset {

    static void display(String p, String up) {

        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        display(p + c, up.substring(1));
        display(p, up.substring(1));
    }

    static ArrayList<String> retAns(String p, String up) {

        if (up.length() == 0) {

            ArrayList<String> base = new ArrayList<>();
            base.add(p);
            return base;
        }
        ArrayList<String> left = retAns(p + up.charAt(0), up.substring(1));
        ArrayList<String> right = retAns(p, up.substring(1));

        left.addAll(right);

        return left;
    }

    static ArrayList<String> retAnsAscii(String p, String up) {

        if (up.length() == 0) {

            ArrayList<String> base = new ArrayList<>();
            base.add(p);
            return base;
        }
        ArrayList<String> first = retAnsAscii(p + up.charAt(0), up.substring(1));
        ArrayList<String> second = retAnsAscii(p, up.substring(1));
        ArrayList<String> third = retAnsAscii(p + (up.charAt(0) + 0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();

        System.out.println(retAnsAscii("", n));
    }
}
