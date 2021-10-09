// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp534 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int nKey = in.nextInt();
            int remPresses[] = new int[1 + nKey];
            for (int i = 1; i <= nKey; i++) {
                remPresses[i] = in.nextInt();
            }
            int nPresses = in.nextInt();
            for (int i = 0; i < nPresses; i++) {
                int keys = in.nextInt();
                remPresses[keys] --;
            }
            for (int i = 1; i <= nKey; i++) {
                if (remPresses[i] < 0) {
                    out.println("yes");
                } else {
                    out.println("no");
                }
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
