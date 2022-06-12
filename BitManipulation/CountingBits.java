public class CountingBits {
    public int[] countBits(int n) {

        int[] ans = new int[n+1];

        for(int i = 0 ; i < n+1  ; i++){

            ans[i] = countOnes(i);
        }

        return ans;

    }


    // keningham's algorithm

    public static int countOnes(int n){

        int counter = 0;

        while(n!=0){

            int rmsb = (n & -n);
            n-=rmsb;
            counter++;
        }

        return counter;

    }
}
