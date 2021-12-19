// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp295 {
    // functions if needed
    // vvvvvvvvv
    public static char encode(char c, int shift) {
        if ('A' <= c && c <= 'Z') {
            return (char) ((c - 'A' + shift) % 26 + 'A');
        } else {
            throw new Error();
        }
    }


    public static String encode(String s, int shift) {
        String r = "";
        for (char c : s.toCharArray()) {
            r += encode(c, shift);
        }
        return r;
    }


    public static String decode(String s, int shift) {
        return encode(s, 26 - shift);
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String Et = in.next();
            String word = in.next();
            for (int shift = 0; shift < 26; shift++) {
                String Ew = encode(word, shift);
                if (Et.contains(Ew)) {
                    out.println(decode(Et,shift));
                    return;
                }
            }
            out.println("IMPOSSIBLE");
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
