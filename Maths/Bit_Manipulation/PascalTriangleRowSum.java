package Bit_Manipulation;

public class PascalTriangleRowSum {
    public static void main(String[] args) {
        int row = 2;
        int ans = rowSum(row);
        if(ans==-1){
            System.out.println("Number should be greater than Zero");
        }
        else
            System.out.println(ans);
    }
    static int rowSum(int n){
        return n<1 ? -1 : 1<<(n-1);
    }

}
