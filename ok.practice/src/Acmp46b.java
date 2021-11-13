// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp46b {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int e[] = new int [] {2,7,1,8,2,8,1,8,2,8,4,5,9,0,4,5,2,3,5,3,6,0,2,8,7,5,0};
            if (e[n+1] > 4) {
                e[n]++;
            }
            String ans = "";
            char f = '0';
            f += e[0];
            ans += f;
            if (n > 0) {
                ans += '.';
            }
            for (int p = 1; p <= n; p++) {
                char d = '0';
                d += e[p];
                ans += d;
            }
            out.println(ans);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
