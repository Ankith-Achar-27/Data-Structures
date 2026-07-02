package Bit_Manipulation;

public class find_ith_Bit {
    public static void main(String[] args) {

        System.out.println(findbit(45,4));
    }
    static int findbit(int num, int i){
// Approach 1
       /*
         45 = 101101
         4th = 001000
         And operation
         001000 = 8
         8==0 ? 0 : 1
         */

/*        int mask = 1<<(i-1);
        return (num & mask) == 0 ? 0 : 1;
*/

// Approach 2: Best
        /*
        45 >> 3 = 101
        101 & 1 = 1
                */
        return num>>(i-1) & 1;
    }

}
