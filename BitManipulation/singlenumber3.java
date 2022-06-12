import java.util.Arrays;
import java.util.Scanner;

class SingleNo3 {
    public int[] singleNumber(int[] nums) {


        int xxory = 0;

        for(int i : nums)

            xxory^=i;


        int rs = xxory & -xxory;

        // bit on and off check

        int x = 0  ; int y = 0;

        for(int i : nums)

            if((i & rs)==0)

                x^=i;

            else

                y^=i;


        return new int[]{x,y};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SingleNo3 singleNo3 = new SingleNo3();
        System.out.println(Arrays.toString(singleNo3.singleNumber(new int[]{2, 2, 5, 6, 7, 7})));
    }
}