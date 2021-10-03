// acmp.ru
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Acmp456 {
    private static class Pair {
        public int first, second;
        Pair(int f, int s) {
            first = f;
            second = s;
        }
    }
    public static Pair makePair(int f, int s) {
        return new Pair(f, s);
    }
    public static Pair computeK(int yrs) {
        int k1 = 1;
        int k2 = 1;
        int k3;
        for(int y = 4; y <= yrs; y++) {
            k3 = k1 + k2;
            k2 = k1;
            k1 = k3;
        }
        return makePair(k1, k2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int x= in.nextInt();
            int y = in.nextInt();
            Pair k = computeK(x);
            //out.println("k1 = " + p.first+" k2 = "+p.second);
            for (int a1 = 0; a1 <= y; a1++) {
                int a2 = (y - k.first * a1) / k.second;
                if (y == k.first * a1 + k.second * a2) {
                    out.println(a2 + " " + a1);
                    return;
                }
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
