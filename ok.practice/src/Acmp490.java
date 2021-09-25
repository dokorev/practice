// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp490 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        in.useDelimiter("(\\s|[.])+");
        int d = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();
        int dEnd = in.nextInt();
        int mEnd = in.nextInt();
        int yEnd = in.nextInt();
        int count = 0;
        while (!(d == dEnd && m == mEnd && y == yEnd)) {
            count++;
            int daysInMonth;
            if (m == 2) {
                daysInMonth = 28;
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                daysInMonth = 30;
            } else {
                daysInMonth = 31;
            }
            if (d == 31 && m == 12) {
                d = 1;
                m = 1;
                y++;
            } else if (d == daysInMonth) {
                d = 1;
                m++;
            } else {
                d++;
            }
        }
        out.println(count);
        // ^^^^^^^^^^
        out.close();
    }
}