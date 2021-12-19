// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp234 {
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
            int sizeJ= in.nextInt();
            boolean isMine[][] = new boolean [1 + sizeI + 1][1 + sizeJ + 1];
            int nMines = in.nextInt();
            for (int m = 0; m < nMines; m++) {
                int i = in.nextInt();
                int j = in.nextInt();
                isMine[i][j] = true;
            }
            for (int i = 1; i <= sizeI;i++) {
                for (int j = 1; j <= sizeJ; j++) {
                    if (isMine[i][j]) {
                        out.print('*');
                    } else {
                        int count = 0;
                        for (int di = -1; di <= 1; di ++) {
                            for (int dj = -1; dj <= 1; dj++) {
                                if (isMine[i + di][j + dj]) {
                                    count++;
                                }
                            }
                        }
                        if (count == 0) {
                            out.print('.');
                        } else {
                            out.print(count);
                        }
                    }
                }
                out.println();
            }
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
