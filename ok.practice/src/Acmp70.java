// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp70 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String s = in.next();
            int k = in.nextInt();
            if (k > 0) {
                int count = 0;
                for (int i = 0; i < k; i++) {
                    for (int j = 0; j < s.length(); j++) {
                        out.print(s.charAt(j));
                        count++;
                        if (count == 1023) {
                            return;
                        }
                    }
                }
            } else {
                k = -k;
                if (s.length() % k != 0) {
                    out.println("NO SOLUTION");
                    return;
                }
                int shift = s.length() / k;
                for (int i = shift; i < s.length(); i++) {
                    if (s.charAt(i) != s.charAt(i - shift)) {
                        out.println("NO SOLUTION");
                        return;
                    }
                }
                out.println(s.substring(0, shift));
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
