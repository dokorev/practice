// acmp.ru
//
// ACMP 570 with WA 11
// possible problem is
// 4 4
// * . . .
// . * . .
// . . * .
// . . . *
// SQUARE <-- should not be square as the original square cannot be 2x2

import java.io.*;
import java.util.*;

public class Acmp458 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int nLines = in.nextInt();
            int order[] = new int [nLines];
            for (int i = 0; i < nLines; i++) {
                order[i] = in.nextInt() - 1;
            }
            String message = in.next();
            int baseWidth = message.length() / nLines;
            int nLongerLines = message.length() % nLines;
            char a[][] = new char[nLines][];
            for (int i = 0; i < nLines; i++) {
                if ( i < nLongerLines) {
                    a[i] = new char[baseWidth + 1];
                } else {
                    a[i] = new char[baseWidth];
                }
            }
            int pos = 0;
            for (int i : order) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = message.charAt(pos);
                    pos++;
                }
            }
            for (int j = 0; j < baseWidth + 1; j++) {
                for (int i = 0; i < nLines; i++) {
                    if (j < a[i].length) {
                        out.print(a[i][j]);
                    }
                }
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
