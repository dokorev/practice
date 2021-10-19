// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp517 {

    // Functions if Needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int a[] = new int[in.nextInt()];
            for (int i  = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            int pos = 0;
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                if (a[pos] == 10) {
                    sum += a[pos] + a[pos + 1] + a[pos + 2];
                    pos++;
                } else if (a[pos] + a[pos+1] == 10) {
                    sum += a[pos] + a[pos + 1] + a[pos + 2];
                    pos += 2;
                } else {
                    sum += a[pos] + a[pos + 1];
                    pos += 2;
                }
            }
            out.println(sum);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
