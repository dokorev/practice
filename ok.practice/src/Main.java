    // acmp.ru
    import java.io.*;
    import java.util.*;
    public class Main {
        // functions if needed
        // vvvvvvvvv
        public static boolean sameChars(String s) {
            for (int i  = 1;i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(0)) {
                   return false;
                }
            }
            return true;
        }

        public static boolean isPal(String s) {
            for (int i = 0; i < s.length() - 1 - i; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
        // ^^^^^^^^^
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);
            try {
                // your solution
                // vvvvvvvvvv
                String s= in.next();
                if (sameChars(s)) {
                    out.println("NO SOLUTION");
                    return;
                } else if (isPal(s)) {
                    out.println(s.substring(1));
                } else {
                    out.println(s);
                }
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
