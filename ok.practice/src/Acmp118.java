// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp118 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int step = in.nextInt();
        int pos = 0;
        for (int len = 2; len <= n; len++) {
            pos = (step + pos) % len;
        }
        out.println(pos + 1);
        // ^^^^^^^^^^
        out.close();
    }
}