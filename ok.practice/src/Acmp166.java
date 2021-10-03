// acmp.ru
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Acmp166 {
    public static int newRobots(int n) {
        int max = 0;
        for (int n3 = 0; n3 <= 4 && n3 * 3 <= n; n3++) {
            int n5 = (n - n3 * 3)/5;
            max = Math.max(max, n3 * 5 + n5 * 9);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int pp = 0;
            int prev = 0;
            int cur = in.nextInt();
            int n = in.nextInt();
            for (int i = 2; i <= n; i++) {
                int next = newRobots(cur + prev + pp);
                pp = prev;
                prev = cur;
                cur = next;
            }
            out.println(pp + prev + cur);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
