package Bit_Manipulation;

public class NotRepeatingNumber {
    public static void main(String[] args) {
        int[] num = {2,3,4,1,2,1,3,6,4};
        System.out.println(findUnique(num));

    }
    static int findUnique(int[] num){
        int ans=0;
        for(int n : num){
            ans = ans^n;
        }
        return ans;
    }
}
