// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n  = in.nextInt();
        int max = 0;
        int a1 = in.nextInt();
        int a2  = in.nextInt();
        int prev = a1;
        int cur = a2;
        for (int i = 2; i < n; i++) {
            int next = in.nextInt();
            max = Math.max(max, prev + cur + next);
            prev = cur;
            cur = next;
        }
        max = Math.max(max, prev + cur + a1);
        max = Math.max(max, a1 + a2 + cur);
        out.println(max);
        // ^^^^^^^^^^
        out.close();
    }
}