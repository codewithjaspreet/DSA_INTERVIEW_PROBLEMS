public class SumofTwoIntegers {

    public int getSum(int a, int b) {

        while(b != 0){

            int answer = a ^ b;                 // XOR operation
            int carry = (a & b) << 1;           // AND operation & left shift operation by 1
            a = answer;
            b = carry;
        }
        return a;
    }
}
