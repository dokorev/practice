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
                String teamName = in.nextLine();
                String members[] = new String [3];
                for (int i = 0; i < 3; i++) {
                    members[i] = in.nextLine();
                }
                Arrays.sort(members);
                out.println(teamName + ": " + members[0] + ", " + members[1] + ", " + members[2]);
                // ^^^^^^^^^^
            } finally {
                out.close();
            }
        }
    }
