// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp68 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String start = in.next();
            int n = in.nextInt();
            if (start.compareTo("School") == 0 && n % 2 == 0) {
                out.println("No");
            } else {
                out.println("Yes");
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
