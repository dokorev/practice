// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp253 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int h = in.nextInt();
        int m = in.nextInt();
        int hEnd = in.nextInt();
        int mEnd = in.nextInt();
        int count = 0;
        while (h != hEnd ||  m!= mEnd) {
            if (m == 30) {
                count++;
            } else if (m == 0) {
                count += (h + 12 - 1) % 12 + 1;
            }
            m++;
            h += m/60;
            m %= 60;
            h %= 24;
        }
        out.println(count);

        // ^^^^^^^^^^
        out.close();
    }
}