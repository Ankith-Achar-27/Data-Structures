package Bit_Manipulation;

// Check a number is odd or even using bit manipulation
// Logic is: number & 1 == 1 then it is odd else even



public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(checknum(3));
        System.out.println(checknum(0));
        System.out.println(checknum(10));
        System.out.println(checknum(17));
    }

    static String checknum(int num){
        return (num & 1) ==1 ? num + " is odd number"
                : num + " is even number" ;
    }
}
