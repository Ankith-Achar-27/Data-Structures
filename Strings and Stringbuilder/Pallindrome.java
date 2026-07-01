
class TestCasePalindrome{
    String str="";
    TestCasePalindrome(String str){
        this.str=str;
    }
}
public class Pallindrome {
    public static void main(String[] args) {
        TestCasePalindrome test1 = new TestCasePalindrome("abcdcba");
        TestCasePalindrome test2 = new TestCasePalindrome("abccba");
        TestCasePalindrome test3 = new TestCasePalindrome("abcdeba");
        TestCasePalindrome test4 = new TestCasePalindrome("a");
        TestCasePalindrome test5 = new TestCasePalindrome("");


        System.out.println(test1.str+" is Pallindrome: "+isPalindrome(test1.str));
        System.out.println(test2.str+" is Pallindrome: "+isPalindrome(test2.str));
        System.out.println(test3.str+" is Pallindrome: "+isPalindrome(test3.str));
        System.out.println(test4.str+" is Pallindrome: "+isPalindrome(test4.str));
        System.out.println(test5.str+" (i.e. empty) is Pallindrome: "+isPalindrome(test5.str));

    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        // for empty string as it is pallindrome
        if (str.isEmpty()){
            return true;
        }

        for (int i=0; i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end){
                return false;
            }
        }
        return true;

    }
}
