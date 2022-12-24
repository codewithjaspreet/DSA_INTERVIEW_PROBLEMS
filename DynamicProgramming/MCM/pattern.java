import java.util.Scanner;

/**
 * pattern
 */
public class pattern {


    // common pattern in MCM

    // k is the point where we are dividing the array

    // i to k and k+1 to j

    // in the for loop k can be from i to j-1 or from
    // j to i+1  depending on the question

    // in the for loop we are calculating the cost of
    // each division and storing the minimum cost in min
    
    

   static int solve(int[] arr , int i  , int j){

        if(i >= j){
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for(int k = i ; k < j ; k++){
            int temp = solve(arr , i , k) + solve(arr , k+1 , j) + arr[i-1]*arr[k]*arr[j];
            min = Math.min(min , temp);
        }

        return min;

    

   }    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(n);

    }
}