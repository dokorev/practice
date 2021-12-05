// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp13 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String l = in.nextLine();
            char a[] = l.substring(0, 4).toCharArray();
            char b[] = l.substring(5, 9).toCharArray();
            int bulls = 0;
            int cows = 0;
            for (int i = 0; i <= 3; i++) {
                if (a[i] == b[i]) {
                    bulls++;
                }
            }
            for (int i = 0; i <= 3; i++) {
                for(int j = 0; j <= 3; j++) {
                    if (i != j && a[i] == b[j]) {
                        cows++;
                        break;
                    }
                }
            }
            out.println(bulls + " " + cows);
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
