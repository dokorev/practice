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
                String n = in.next();
                out.print('1');
                for (int i = n.length() - 1; i >= 0; i--) {
                    if (n.charAt(i) == '0') {
                        out.print('0');
                    } else  {
                        break;
                    }
                }
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
