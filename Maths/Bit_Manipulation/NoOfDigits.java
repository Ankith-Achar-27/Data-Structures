package Bit_Manipulation;

// To find the no. of digits for the given base
// we take the counter increase it for every right shift till zero is obtained

// Alternate and shortcut approach

// for the given base 'b' and number 'n'
// no. of digits = int(log(n) base(b)) + 1
// >> int(log(n) / log(b)) + 1


public class NoOfDigits {
    public static void main(String[] args) {
        int n = 344545;
        int base = 2;
        int digits = (int)(Math.log(n) / Math.log(base)) + 1;
        System.out.println(digits);
    }
}
