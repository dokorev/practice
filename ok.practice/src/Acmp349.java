// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp349 {

    // Functions if Needed
    // vvvvvvvvv
    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int first = in.nextInt();
            int last = in.nextInt();
            boolean absent = true;
            for (int i = first; i <= last; i++) {
                if (isPrime(i)) {
                    out.println(i);
                    absent = false;
                }
            }
            if (absent) {
                out.println("Absent");
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
