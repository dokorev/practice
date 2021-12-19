// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp666 {
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
            for (int step = 26; step >= 1; step--) {
                if (n==1) {
                    out.println((char) ('a' + (step - 1)));
                    return;
                } else if (n <= 1 << (step - 1)) {
                    n--;
                } else {
                    n-= 1 << (step - 1);
                }
            }
            throw new Error();
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
