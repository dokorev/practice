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
                String s= in.next();
                String t=  in.next();
                int si = 0;
                for (int ti = 0; ti < t.length(); ti++) {
                    if (s.charAt(si) == t.charAt(ti)) {
                        si++;
                        if (si == s.length()) {
                            out.println("YES");
                            return;
                        }
                    }
                }
                out.println("NO");
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
