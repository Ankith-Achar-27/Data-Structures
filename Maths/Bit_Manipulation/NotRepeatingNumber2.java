package Bit_Manipulation;

public class NotRepeatingNumber2 {
    public static void main(String[] args) {
        int[] num = {2,2,4,2,7,8,7,7,8,8};

        int result = 0;

        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            for (int n : num) {
                if ((n & (1 << bit)) != 0) {
                    count++;
                }
            }

            if (count % 3 != 0) {
                result |= (1 << bit);
            }
        }

        System.out.println(result);
    }
}