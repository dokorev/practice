// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp446 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int sizeI = in.nextInt();
            in.nextInt();
            String s[] = new String[sizeI];
            for (int i = 0; i < sizeI; i++) {
                s[i] = in.next();
            }
            for (int i = 0; i < sizeI; i++) {
                for (char c : s[i].toCharArray()) {
                    int code  = in.nextInt();
                    if (code == 0 && c != '.' ||
                            code == 1 && c != '.' && c != 'B' ||
                            code == 2 && c != '.' && c != 'G' ||
                            code == 3 && c != '.' && c != 'G' && c != 'B' ||
                            code == 4 && c != '.' && c != 'R' ||
                            code == 5 && c != '.' && c != 'R' && c != 'B' ||
                            code == 6 && c != '.' && c != 'R' && c != 'G' ||
                            code == 7 && c != '.' && c != 'R' && c != 'G' && c != 'B') {
                        out.println("NO");
                        return;
                    }
                }
            }
            out.println("YES");
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
