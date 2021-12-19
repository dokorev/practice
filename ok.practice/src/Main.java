// acmp.ru

import java.io.*;
import java.util.*;

public class Main {
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
                    char n = code[j];
                    if (c == n) {
                        cd1 = j;
                        break;
                    }
                }
                // need to cd1 - i to get ans (in decode)
                for (int i = 0; i <= pos + 1; i++) {
                    cd1--;
                    if (cd1 < 0) {
                        cd1 = 26;
                    }
                }
                char m = decode[cd1];
                ans = ans + m;
            }
            out.println(ans);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
