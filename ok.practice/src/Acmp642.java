// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp642 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int a[] = new int [in.nextInt()];
            int s = in.nextInt();
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            int count = 0;
            int curSum = 0;
            for (int i = 0; i < a.length; i++) {
                if (curSum + a[i] <= s) {
                    curSum += a[i];
                    count++;
                } else {
                    break;
                }
            }
            out.println(count);

            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
