import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutations {

    static void display(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {

            String left = p.substring(0, i);
            String right = p.substring(i);
            display(left + ch + right, up.substring(1));

        }

    }

    static ArrayList<String> display1(String p, String up) {

        if (up.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add(p);
            return base;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {

            String left = p.substring(0, i);
            String right = p.substring(i);
            ans.addAll(display1(left + ch + right, up.substring(1)));

        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();

        ArrayList<String> ans = display1("", n);
        System.out.println(ans);
    }
}
