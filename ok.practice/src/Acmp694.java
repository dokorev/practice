// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp694 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int maxFirst = in.nextInt();
        int minSecond = in.nextInt();
        for (int i = 1; i < n; i++) {
            int first = in.nextInt();
            int second = in.nextInt();
            maxFirst = Math.max(maxFirst, first);
            minSecond = Math.min(minSecond, second);
        }
        if (maxFirst <= minSecond) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        // ^^^^^^^^^^
        out.close();
    }
}