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
                String s;
                if (in.hasNext()) {
                    s= in.next();
                } else {
                    s = "";
                }
                if (s.length() >= 1) {
                    out.print(s.charAt(0));
                }
                int a = 1;
                int b = 1;
                while (true) {
                    int c = a + b;
                    if (c > s.length()) {
                        break;
                    }
                    out.print(s.charAt(c-1));
                    a = b;
                    b = c;
                }
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
