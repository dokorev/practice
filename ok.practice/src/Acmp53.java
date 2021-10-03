// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            int m = in.nextInt();
            int red = 0;
            int green = 0;
            int blue = 0;
            for (int row = 1; row <= n; row++) {
                for (int column = 1; column <= m; column++) {
                    int s= row * column;
                    if (s % 5 == 0) {
                        blue++;
                    } else if (s % 3 == 0) {
                        green++;
                    } else if (s % 2 == 0) {
                        red++;
                    }
                }
            }
            out.println("RED : " + red);
            out.println("GREEN : " + green);
            out.println("BLUE : " + blue);
            out.println("BLACK : " + (m*n - blue - red - green));
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
