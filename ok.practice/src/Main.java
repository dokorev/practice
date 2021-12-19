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
                    int a[] = new int[in.nextInt()];
                    for (int i = 0; i < a.length; i++) {
                        a[i] = in.nextInt();
                    }
                    Arrays.sort(a);
                    a = Arrays.copyOf(a, a.length + 1);
                    a[a.length - 1] = a[a.length - 2] + 2;
                    StringBuilder commaSeperated = new StringBuilder();
                    int groupFirst = -1;
                    int groupLast = -1;
                    boolean first = true;
                    for (int i = 0; i < a.length; i++) {
                        if (i == 0) {
                            commaSeperated.append(a[i]);
                            groupFirst = a[i];
                            groupLast = a[i];
                        } else {
                            if (a[i] == a[i - 1]) {

                            } else if (a[i] == a[i-1] + 1) {
                                commaSeperated.append(", ");
                                commaSeperated.append(a[i]);
                                groupLast++;
                            } else {
                                String withDots = groupFirst + ", ..., " + groupLast;
                                if (first) {
                                    first = false;
                                } else {
                                    out.print(", ");
                                }
                                if (withDots.length() < commaSeperated.length()) {
                                    out.print(withDots);
                                } else {
                                    out.print(commaSeperated);
                                }
                                commaSeperated.setLength(0);
                                commaSeperated.append(a[i]);
                                groupFirst = a[i];
                                groupLast = a[i];
                            }
                        }
                    }

                    // ^^^^^^^^^^
                } finally {
                    out.close();
                }
            }
        }
