// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp296 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        for (int n3 = 0; n3 < 5; n3++) {
            if ((n - n3 * 3) % 5 == 0) {
                int n5 =  (n - n3 * 3) / 5;
                out.println(n5 + " " + n3);
                out.close();
                return;
            }
        }
        throw new Error ("Did not find solution");
        // ^^^^^^^^^^

    }
}