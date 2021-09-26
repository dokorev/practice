// acmp.ru
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Acmp383 {
    private static class SumAndCount {
        public int sum, count;
        SumAndCount(int s, int c) {
            sum = s;
            count = c;
        }
    }
    private static SumAndCount sumAndCountOfDigits(int a) {
        int sum = 0;
        int count = 0;
        while (a > 0) {
            int d = a % 10;
            sum += d;
            a /= 10;
            count++;
        }
        return new SumAndCount(sum, count);
    }
    private static boolean isBeautiful(int n ) {
        SumAndCount sumAndCount = sumAndCountOfDigits(n);
        return (sumAndCount.sum % sumAndCount.count == 0);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int i = 1;
            while (n > 0) {
                if (isBeautiful(i)) {
                    n--;
                }
                i++;
            }
            out.println(i - 1);
            // i-1
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
