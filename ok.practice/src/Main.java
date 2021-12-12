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
                String str = in.nextLine();
                char s[] = str.toCharArray();
                int n = str.length();
                boolean a[] = new boolean [1000];
                for (int i = 0; i < n-2; i++) {
                    for (int j = i + 1; j < n-1; j++) {
                        for (int k = j + 1; k < n; k++) {
                            int singles = s[k] - '0';
                            int tens = s[j] - '0';
                            int hund = s[i] - '0';
                            int number = hund * 100 + tens * 10 + singles;
                            if (hund >= 1) {
                                a[number] = true;
                            }
                        }
                    }
                }
                int ans = 0;
                for (int i = 0; i < a.length; i++) {
                    if (a[i] == true) {
                        ans++;
                    }
                }
                out.println(ans);
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
