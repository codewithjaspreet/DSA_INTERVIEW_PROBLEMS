
public class XorInRange {

    public static int rangeXor(int left, int right) {

        return XorOneToN(right) ^ XorOneToN(left - 1);

    }

    public static int XorOneToN(int n) {

        if (n % 4 == 0)
            return n;

        if (n % 4 == 1)
            return 1;

        if (n % 4 == 2)
            return n + 1;

        else
            return 0;

    }

    public static void main(String[] args) {

        System.out.println(rangeXor(4, 8));
    }
}
