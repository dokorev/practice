// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp347 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int a[] = new int [5];
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            int b[] = new int [1 + 13];
            for (int x : a) {
                b[x]++;
            }
            int c[] = new int [1 + 5];
            for (int x : b) {
                c[x]++;
            }
            if (c[5] == 1) {
                out.println("Impossible");
            } else if (c[4] == 1) {
                out.println("Four of a Kind");
            } else if (c[3] == 1 && c[2] == 1) {
                out.println("Full House");
            } else if (c[3] == 1) {
                out.println("Three of a Kind");
            } else if (c[2] == 2) {
                out.println("Two Pairs");
            } else if (c[2] == 1) {
                out.println("One Pair");
            } else if (c[1] == 5) {
                int min = 14;
                int max = 0;
                for (int x : a) {
                    min = Math.min(min, x);
                    max = Math.max(max, x);
                }
                if (max - min == 4) {
                    out.println("Straight");
                } else {
                    out.println("Nothing");
                }
            } else {
                throw new Error();
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
