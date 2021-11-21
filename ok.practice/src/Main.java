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
                int sizeI = in.nextInt();
                int sizeJ = in.nextInt();
                char a[][] = new char[1 + sizeI + 1][1 + sizeJ + 1];
                for (int i = 0; i < a.length; i++) {
                    Arrays.fill(a[i], '.');
                }
                for (int i = 1; i <= sizeI; i++) {
                    String s = in.next();
                    for (int j = 1; j <= sizeJ; j++) {
                        a[i][j] = s.charAt(j - 1);
                    }
                }
                int count = 0;
                for (int i = 1; i <= sizeI; i++) {
                    for (int j = 1; j <= sizeJ; j++) {
                        if (a[i][j] == '.' && a[i+1][j] == '.' && a[i-1][j] == '.' && a[i][j+1] == '.' && a[i][j-1] == '.' ) {
                            count++;
                        }
                    }
                }
                out.println(count);
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
