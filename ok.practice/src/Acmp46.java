// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp46 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            StringBuilder sb = new StringBuilder("2.71828182845904523536028750");
            int n = in.nextInt();
            if (n == 0) {
                out.println("3");
                return;
            }
            char last = sb.charAt(n+1);
            char after = sb.charAt(n+2);
            if ('5' <= after && after <= '9') {
                last++;
            }
            sb.setCharAt(n+1, last);
            out.println(sb.substring(0, n+2));
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
