package Bit_Manipulation;

// Check a number is odd or even using bit manipulation
// Logic is: number & 1 == 1 then it is odd else even

class TestOddEven{
    int num;

    public TestOddEven(int num) {
        this.num = num;
    }
}

public class OddOrEven {
    public static void main(String[] args) {
        TestOddEven test1 = new TestOddEven(3);
        TestOddEven test2 = new TestOddEven(0);
        TestOddEven test3 = new TestOddEven(10);
        TestOddEven test4 = new TestOddEven(17);

        checknum(test1.num);
        checknum(test2.num);
        checknum(test3.num);
        checknum(test4.num);

    }
    static void checknum(int num){
        if((num & 1) ==1){
            System.out.println(num+" is odd number");
        }
        else{
            System.out.println(num+" is even number");
        }
    }
}
