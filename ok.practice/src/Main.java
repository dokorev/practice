    // acmp.ru
    import java.io.*;
    import java.util.*;
    public class Main {
        // functions if needed
        // vvvvvvvvv
        public static int plusMinSum(String s) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                int d = s.charAt(i) - '0';
                if (i % 2 == 0) {
                    sum += d;
                } else {
                    sum -= d;
                }
            }
            return sum;
        }
        // ^^^^^^^^^
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);
            try {
                // your solution
                // vvvvvvvvvv
                String s= in.next();
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < s.length(); i++) {
                    max =  Math.max(max, plusMinSum(s.substring(0, i) + s.substring(i + 1)));
                }
                out.println(max);
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
