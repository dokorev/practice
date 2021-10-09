// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp274 {

    public static boolean contains(int n, int d) {
        while (n > 0) {
            if (n%10 == d) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static boolean areFriendly(int a, int b) {
        for (int d= 0; d <= 9; d++) {
            if (contains(a, d) != contains(b, d)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            for (int i = 0; i< n ; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                if (areFriendly(a, b)) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }


            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
