// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp89 {
    // functions if needed
    // vvvvvvvvv
    public static int timeToMinutes(String s) {
        int h10 = s.charAt(0);
        int h1 = s.charAt(1);
        int m10 = s.charAt(3);
        int m1 = s.charAt(4);
        return (h10 * 10 + h1) * 60 + (m10 * 10 + m1);
    }

    public static int RoundNearest(int a, int b) {
        return (a + b / 2) / b;
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            in.nextLine();
            String BestName = null;
            int besTime = 24 * 60 + 1;
            for (int i = 0; i < n; i++) {
                String s = in.nextLine();
                int begin = timeToMinutes(s.substring(s.length() - 11, s.length() - 6));
                int end = timeToMinutes(s.substring(s.length() - 5));
                int time;
                if (begin < end) {
                    time = end - begin;
                } else {
                    time = end + 24 * 60  - begin;
                }
                if (time < besTime) {
                    besTime = time;
                    BestName = s.substring(0, s.length() - 12);
                }
            }
            out.println("The fastest train is " + BestName + ".");
            out.println("Its speed is " + RoundNearest(650 * 60, besTime) + " km/h, approximately.");
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
