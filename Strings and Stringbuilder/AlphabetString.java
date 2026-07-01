public class AlphabetString {
    public static void main(String[] args) {
        String series="";
        for (int i=0;i<26;i++){
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);
    }
}
// this is not preferred because lots of memory are wasted
// as through each iteration it copies the object and add new value to it
// that is a,ab,abc,abcd,.............,abc...yz
// so after the output the other objects will just sit in heap without any reference variable
