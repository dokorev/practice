// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp316 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        if (n % 107 <= 7) {
            out.println(n / 107 * 100 + " " + n/107 * 7);
        } else {
            out.println((n / 107 * 100 + n % 107 - 7) + " " + (n/107*7 + 7));
        }

        // ^^^^^^^^^^
        out.close();
    }
}