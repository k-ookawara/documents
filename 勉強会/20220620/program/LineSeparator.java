
public class LineSeparator {
    public static void main(String[] args) {

        String a = "abc\r\ndef";
        String b = "abc\ndef";
        String c = "abc" + System.lineSeparator() + "def";

        /*
         * a b c CR LF d e f
         * 61 62 63 d a 64 65 66
         */
        System.out.println(a);
        a.chars().forEach(ch -> System.out.print(Integer.toHexString(ch)));
        System.out.println("");

        /*
         * a b c LF d e f
         * 61 62 63 d a 64 65 66
         */
        System.out.println(b);
        b.chars().forEach(ch -> System.out.print(Integer.toHexString(ch)));
        System.out.println("");

        System.out.println(c);
        c.chars().forEach(ch -> System.out.print(Integer.toHexString(ch)));
    }
}
