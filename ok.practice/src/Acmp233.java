// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp233 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int h = in.nextInt();
            if (h <= 437) {
                out.println("Crash " + i);
                return;
            }
        }
        out.println("No crash");
        // ^^^^^^^^^^
        out.close();
    }
}