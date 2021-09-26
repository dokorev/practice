// acmp.ru
import java.io.*;
import java.util.*;

public class Acmp170 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // your solution
        // vvvvvvvvvv
        int n = in.nextInt();
        int maxCount = 1;
        for (int count = 2; 2*n - (count - 1) * count >= 2 * count; count ++) {
            if ((2*n - (count - 1)  * count) % (2*count) == 0) {
                maxCount = count;
            }
        }
        out.println(maxCount);
        // ^^^^^^^^^^
        out.close();
    }
}
