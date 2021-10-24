// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp522 {

    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int size1 = in.nextInt();
            int size2 = in.nextInt();
            boolean set1[] = new boolean [32000 + 1 + 32000];
            for (int i = 0; i < size1; i++) {
                set1[in.nextInt() + 32000] = true;
            }
            boolean set2[] = new boolean [32000 + 1 + 32000];
            for (int i = 0; i < size2; i++) {
                set2[in.nextInt() + 32000] = true;
            }
            if (Arrays.equals(set1, set2)) {
                out.println(1);
            } else {
                out.println(0);
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
