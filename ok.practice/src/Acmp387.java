// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp387 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                String s = in.next();
                if (s.charAt(0) == s.charAt(3)) {
                    count++;
                }
            }
            out.println(count);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
