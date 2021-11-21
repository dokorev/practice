    // acmp.ru
    import java.io.*;
    import java.util.*;
    public class Main {
        // functions if needed
        // vvvvvvvvv

        // ^^^^^^^^^
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);
            try {
                // your solution
                // vvvvvvvvvv
                String s = in.nextLine();
                if (s.length() == 5 && 'A' <= s.charAt(0) && s.charAt(0) <= 'H' && '1' <= s.charAt(1) && s.charAt(1) <= '8'
                        && s.charAt(2) == '-' && 'A' <= s.charAt(3) && s.charAt(3) <= 'H' && '1' <= s.charAt(4)
                        && s.charAt(4) <= '8') {
                    int d1 = s.charAt(3) - s.charAt(0);
                    int dd = s.charAt(4) - s.charAt(1);
                    if (d1 * d1 + dd * dd == 5) {
                        out.println("YES");
                    } else {
                        out.println("NO");
                    }
                } else {
                    out.println("ERROR");
                }
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
