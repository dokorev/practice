// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp95 {
    // functions if needed
    // vvvvvvvvv
    private static String intToString(int n) {
        int length = (int) Math.floor(Math.log10(n)) + 1;
        char d[] = new char[length];
        for (int i = length - 1; i >= 0; i--) {
            int rDigit = n % 10;
            d[i] = (char) ('0' + rDigit);
            n /= 10;
        }
        return new String(d);
    }

    private static int sumDigits(String sn) {
        char chars[] = sn.toCharArray();
        int sum = 0;
        for (char c : chars) {
            int d = c - '0';
            sum += d;
        }
        return sum;
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String sn = in.nextLine();
            int sum = 0;
            int count = 0;
            while (sn.length() >= 2) {
                sum = sumDigits(sn);
                count++;
                sn = intToString(sum);
            }
            out.println(sn + " " + count);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
