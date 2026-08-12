public class PalindromeNumber {
    static int sum = 0;

    static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse(n/10);
    }

    static boolean palindrome(int n){
        return n == sum;
    }
    public static void main(String[] args) {
        int n = 1221;
        reverse(n);
        System.out.println(palindrome(n));

    }
}
