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

public class Acmp237 {
    // functions if needed
    // vvvvvvvvv


    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int size  =  in.nextInt();
            int nWords = in.nextInt();
            int count[] = new int[1 + 'Z'];
            for (int i = 0; i < size; i++) {
                for (char c : in.next().toCharArray()) {
                    count[c]++;
                }
            }
            for (int i = 0; i < nWords; i++) {
                for (char c : in.next().toCharArray()) {
                    count[c]--;
                }
            }
            for (char c = 'A'; c <= 'Z'; c++) {
                while (count[c] > 0) {
                    out.print(c);
                    count[c]--;
                }
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
