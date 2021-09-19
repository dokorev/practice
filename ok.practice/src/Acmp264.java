// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int maxLen = 0;
        int curLen = 0;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if (t > 0) {
                curLen++;
            } else {
                curLen = 0;
            }
            maxLen = Math.max(maxLen, curLen);
        }
        out.println(maxLen);
        // ^^^^^^^^^^
        out.close();
    }
}