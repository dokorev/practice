// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp349B {

    // Functions if Needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int m = in.nextInt();
            int n = in.nextInt();
            // sift prime numbers
            // false = prime, true = composite
            boolean prime[] = new boolean [n + 1];
            prime[0] = prime[1] = true;
            for (int i = 2; i * i <= n; i++) {
                if (prime[i] == false) {
                    for (int j = i * i; j <= n; j += i) {
                        prime[(int)j] = true;
                    }
                }
            }
            boolean foundPrime = false;
            for (int i = m; i <= n; i++) {
                if (prime[i] == false) {
                    out.println(i);
                    foundPrime = true;
                }
            }
            if (!foundPrime) {
                out.println("Absent");
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
