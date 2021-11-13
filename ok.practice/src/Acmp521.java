// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp521 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int first = in.nextInt();
        int last = in.nextInt();
        int count = 0;
        int max = 0;
        for (int size = first; size <= last; size++) {
            int s = size;
            while (size != 2) {
                if (s % 2 == 0) {
                    s /= 2;
                } else {
                    s = s*3 + 1;
                }
                max = Math.max(max, s);
                count++;
            }
        }
        out.println(count);
        // ^^^^^^^^^^
        out.close();
    }
}