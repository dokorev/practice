    // acmp.ru
    import java.io.*;
    import java.util.*;
    public class Main {
        // functions if needed
        // vvvvvvvvv
        public static int root(String s) {
            int sum = 0;
            for (char c  : s.toCharArray()) {
                sum += c - '0';
            }
            if (sum < 10) {
                return sum;
            } else {
                return root("" + sum);
            }
        }
        // ^^^^^^^^^
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);
            try {
                // your solution
                // vvvvvvvvvv
                String s = in.next();
                for (int len1 = 1; len1 < s.length(); len1++) {
                    if (root(s.substring(0, len1)) == root(s.substring(len1))) {
                        out.println("YES");
                        return;
                    }
                }
                out.println("NO");
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
