// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp73b {
    // functions if needed
    // vvvvvvvvv
    final static char code[] = "0123456789ABCDEFGHIJKLMNOPQ".toCharArray();
    final static char decode[] = "abcdefghijklmnopqrstuvwxyz ".toCharArray();

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String s = in.nextLine();
            String ans = "";
            for (int pos = 0; pos < s.length(); pos++) {
                int c = s.charAt(pos);
                int cd1 = 1;
                for (int j = 0; j < code.length; j++) {
                    if (c == code[j]) {
                        cd1 = j;
                        break;
                    }
                }
                // need to cd1 - i to get ans (in decode)
                // (a - b) % m = (a + (m - b % m)) % m
                // (3 - 5) % 4 = (3 + (4 - (5 % 4))) % 4
                cd1 = (cd1 + 27 - (pos + 2) % 27) % 27;
                ans += decode[cd1];
            }
            out.println(ans);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
