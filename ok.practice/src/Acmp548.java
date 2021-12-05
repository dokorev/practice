// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp548 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String s1 = in.next() + ":";
            String s2 = in.next() + ":";
            String res = "";
            while (s1.charAt(0) != ':' || s2.charAt(0) != ':') {
                if (s1.compareTo(s2) < 0) {
                    out.print(s1.charAt(0));
                    s1 = s1.substring(1);
                } else {
                    out.print(s2.charAt(0));
                    s2 = s2.substring(1);
                }
            }
            out.println(res);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
