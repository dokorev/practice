// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp526 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String s = in.nextLine();
            int n = in.nextInt();
            for (int radix = 2; radix <= 36; radix++) {
                if (Integer.toString(n, radix).toUpperCase().compareTo(s) == 0) {
                    out.println(radix);
                    return;
                }
            }
            out.println(0);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
