// acmp.ru
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Acmp682 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            if (n==1) {
                out.print(45);
            } else if (n==2) {
                out.print(4905);
            } else {
                out.print(494);
                for (int i = 0; i < n -3; i++) {
                    out.print(9);
                }
                out.print(55);
                for (int i = 0; i < n - 2; i++) {
                    out.print(0);
                }
                out.println();
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
