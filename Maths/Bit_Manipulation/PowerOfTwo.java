package Bit_Manipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 1024;
        if(n>0 && (n&(n-1))==0){
            System.out.println(n+" is power of 2.");
        }
        else{
            System.out.println(n+" is not power of 2");
        }
    }
}
