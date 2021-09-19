// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        for (long x = -100; x <= 100; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                out.println(" " + x);
            }
        }
        // ^^^^^^^^^^
        out.close();
    }
}