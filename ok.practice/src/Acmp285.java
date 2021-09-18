// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp285 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int t = in.nextInt();
        int a1 = in.nextInt();
        int max = a1;
        int sum = a1;
        for (int i = 1; i < n; i++) {
            int ai = in.nextInt();
            max = Math.max(max, ai);
            sum += ai;
        }
        if (max <= t && t <= sum - (n-1)) {
            out.println("yes");
        } else {
            out.println("no");
        }
        // ^^^^^^^^^^
        out.close();
    }
}