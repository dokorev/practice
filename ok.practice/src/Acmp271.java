// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp271 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int prev = 1;
        int cur = 1;
        int pos = 2;
        while (cur < n) {
            int next = prev + cur;
            prev = cur;
            cur = next;
            pos++;
        } if (cur == n) {
            out.println(1);
            out.println(pos);
        } else {
            out.println(0);
        }
        // ^^^^^^^^^^
        out.close();
    }
}