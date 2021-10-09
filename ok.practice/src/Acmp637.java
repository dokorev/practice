// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp637 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int a[] = new int[in.nextInt()];
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            int max = in.nextInt();
            int count = 0;
            for (int x : a) {
                count += Math.min(max, x);
            }
            out.println(count);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
