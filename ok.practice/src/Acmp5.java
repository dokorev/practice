// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i  < n; i++) {
                a[i] = in.nextInt();
            }
            int nOdd = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    if (nOdd > 0) {
                        out.print(" ");
                    }
                    out.print(a[i]);
                    nOdd++;
                }
            }
            out.println();
            int nEven = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    if (nEven > 0) {
                        out.print(" ");
                    }
                    out.print(a[i]);
                    nEven ++;
                }
            }
            out.println();
            if (nEven >= nOdd) {
                out.println("YES");
            } else {
                out.println("NO");
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
