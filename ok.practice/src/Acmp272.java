// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp272 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int max = -10_001;
        int min = 10_001;
        while (true) {
            if (in.hasNextInt()) {
                min = Math.min(min, in.nextInt());
            } else {
                break;
            }
            if (in.hasNextInt()) {
                max = Math.max(max, in.nextInt());
            } else {
                break;
            }
        }
        out.println(min + max);
        // ^^^^^^^^^^
        out.close();
    }
}
