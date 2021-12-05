// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp416 {
    // functions if needed
    // vvvvvvvvv

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            String s= in.next();
            char LetterK = s.charAt(0);
            char DigitK = s.charAt(1);
            for (char letter = 'a'; letter <= 'h'; letter++) {
                for (char digit = '1'; digit <= '8'; digit++) {
                    int d1 = LetterK - letter;
                    int dd = DigitK - digit;
                    if (d1 * d1 + dd * dd == 5) {
                        out.println("" + letter + digit);
                    }
                }
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
