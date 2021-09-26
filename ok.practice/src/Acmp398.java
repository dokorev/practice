// acmp.ru
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int count = 0;
            for (int a = 1; a < n; a++) {
                for (int b = a; b < n; b++) {
                    for (int c = b; c < n; c++) {
                        int d = n - a - b - c;
                        if (d < c) {
                            break;
                        } else {
                            count++;
                        }
                    }
                }
            }
            out.println(count);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
