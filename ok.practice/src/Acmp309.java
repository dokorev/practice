// acmp.ru
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Acmp309 {
    public static int reverse(int n) {
        int r= 0;
        while (n > 0) {
            int d= n%10;
            n /= 10;
            r= r * 10 + d;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int sum = in.nextInt();
            int count = 0;
            for (int i = 1; i < sum; i++) {
                if (i + reverse(i) == sum) {
                    count++;
                }
            }
            out.println(count);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
