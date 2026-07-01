import java.util.Arrays;

public class StringArrays1 {
    public static void main(String[] args) {
        String name = "Ankith Achar";
        System.out.println(name.toCharArray()); // Ankith Achar
        System.out.println(Arrays.toString(name.toCharArray())); // [A, n, k, i, t, h,  , A, c, h, a, r]
        System.out.println(name.toLowerCase()); // ankith achar
        System.out.println(name.toUpperCase()); // ANKITH ACHAR
        System.out.println(name.indexOf('h')); // 5
        System.out.println("     Ankith        ".strip());//Ankith
        System.out.println(Arrays.toString(name.split(" ")));//[Ankith, Achar] split where there is space


    }
}
