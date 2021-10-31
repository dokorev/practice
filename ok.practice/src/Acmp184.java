// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp184 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int daysInMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            int daysBeforeMonths[] = new int [13];
            for (int i = 1; i <= 12; i++) {
                daysBeforeMonths[i] = daysBeforeMonths[i - 1] + daysInMonth[i - 1];
            }
            int t[] = new int [in.nextInt()];
            in.useDelimiter("(\\s|\\.|\\:)+");
            for (int i = 0; i < t.length; i++) {
                int day = in.nextInt();
                int month = in.nextInt();
                int hour = in.nextInt();
                int min = in.nextInt();
                int daysBefore = daysBeforeMonths[month] + day - 1;
                t[i] = daysBefore * 8 * 60 + (hour - 10) * 60 + min;
            }
            Arrays.sort(t);
            int sum = 0;
            for (int i = 0; i < t.length; i += 2) {
                sum += t[i + 1] - t[i] + 1;
            }
            int h = sum / 60;
            int m = sum % 60;
            out.println(h + ":" + m / 10 + m % 10);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
