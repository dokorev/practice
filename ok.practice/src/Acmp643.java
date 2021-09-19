// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp643 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int n0 = n;
        int count = 0;
        while (n>0) {
            if (n % 2 == 1) {
                count ++;
            }
            n /= 2;
        }
        out.println(n0 + count);
        // ^^^^^^^^^^
        out.close();
    }
}