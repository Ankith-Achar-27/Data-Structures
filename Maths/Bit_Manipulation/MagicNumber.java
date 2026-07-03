package Bit_Manipulation;

// if 1 = 5 that is (001)2 in binary in 5 base starting from 5^1
// 2 is (010)2 = 5^2 = 25
// 4 = (100)2 = 5^3 = 125 ets

// find nth magic number

public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;

        while (n>0){
            int lastDigit = n&1;
            n = n>>1;

            ans += lastDigit*base;
            base *= 5;
        }
        System.out.println(ans);
    }
}
