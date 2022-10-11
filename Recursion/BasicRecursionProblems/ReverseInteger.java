import java.util.Scanner;

class Solution {

    static int sumOfDigits = 0;

    static int reverse(int n) {
        // code here
        if (n == 0)
            return sumOfDigits;
        sumOfDigits = sumOfDigits * 10 + n % 10;
        return reverse(n / 10);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}