public class AlbhabetStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<26;i++){
            char ch =(char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
// instead of previous method of printing alphabet using Strings this is preferred
// as String builder is mutable rather than String which is immutable
// does not require extra space