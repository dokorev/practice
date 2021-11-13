// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp691 {
    // functions if needed
    // vvvvvvvvv
    public static boolean isValidLetter(char c) {
        final String match = "ABCEHKMOPTXY";
        return match.indexOf(c) >= 0;
    }
    public static boolean isValid(String lp) {
        if (lp.length() != 6) {
            return false;
        } else {
            return isValidLetter(lp.charAt(0)) &&
                    Character.isDigit(lp.charAt(1)) &&
                    Character.isDigit(lp.charAt(2)) &&
                    Character.isDigit(lp.charAt(3)) &&
                    isValidLetter(lp.charAt(4)) &&
                    isValidLetter(lp.charAt(5));
        }
    }
    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            int n = in.nextInt();
            in.nextLine();
            while (n-- > 0) {
                String a = in.nextLine();
                if (isValid(a)) {
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
