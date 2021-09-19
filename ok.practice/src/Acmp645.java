// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp645 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int minBeauty = n - 1;
        int minH = 1;
        int minW = n;
        for (int h = 2; h*h <= n; h++) {
            int w = n/h;
            int beauty = Math.abs(h-w) + n - w * h;
            if (beauty < minBeauty) {
                minBeauty = beauty;
                minH = h;
                minW = w;
            }
        } out.println(minH + " " + minW);
        // ^^^^^^^^^^
        out.close();
    }
}