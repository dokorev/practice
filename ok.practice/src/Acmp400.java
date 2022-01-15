// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp400 {
    // functions if needed
    // vvvvvvvvv
    public static class Side {

        int min;

        int max;

        Side(Scanner in) {
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            min = Math.min(v1, v2);
            max = Math.max(v1, v2);
        }
    }

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            Side a[] = new Side[6];
            for (int i = 0; i < 6; i++) {
                a[i] = new Side(in);
            }
            Arrays.sort(a, (left, right) -> {
                if (left.min != right.min) {
                    return left.min - right.min;
                }
                return left.max - right.max;
            });
            if (a[0].min == a[1].min && a[0].min == a[2].min && a[0].min == a[3].min && a[2].max == a[3].max && a[2].max == a[4].max && a[2].max == a[5].max && a[0].max == a[1].max && a[0].max == a[4].min && a[0].max == a[5].min) {
                out.println("POSSIBLE");
            } else {
                out.println("IMPOSSIBLE");
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
