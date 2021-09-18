// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp246 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int prev = in.nextInt();
        int nCuts = 0;
        for (int i = 1; i < n; i++) {
            int cur = in.nextInt();
            if (cur != prev + 1) {
                nCuts++;
            }
            prev = cur;
        }
        out.println(nCuts);
        // ^^^^^^^^^^
        out.close();
    }
}