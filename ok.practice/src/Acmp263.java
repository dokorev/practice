// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int k1 = in.nextInt();
        int L1 = in.nextInt();
        int m1 = in.nextInt();
        int k2 = in.nextInt();
        int L2 = in.nextInt();
        int m2 = in.nextInt();
        int sum1 = k1 * m1 + k2 * m2;
        int nk1 = (k1*(100 - L1))/100;
        int nk2 = (k2*(100 - L2))/100;
        int sum2 = Math.min(nk1, nk2) * (m1 + m2);
        out.println(sum1 - sum2);
        // ^^^^^^^^^^
        out.close();
    }
}
