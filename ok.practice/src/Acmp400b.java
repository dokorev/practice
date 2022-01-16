// acmp.ru

import java.io.*;
import java.util.*;

public class Acmp400b {
    // functions if needed
    // vvvvvvvvv

    static class Tile implements Comparable<Tile> {

        int mnDim, mxDim;

        Tile(int a1, int a2) {
            mnDim = Math.min(a1, a2);
            mxDim = Math.max(a1, a2);
        }

        @Override
        public int compareTo(Tile o) {
            int keyA = mnDim * 10000 + mxDim;
            int keyB = o.mnDim * 10000 + o.mxDim;
            return (keyA - keyB);
        }

        public boolean equals(Tile o) {
            return mnDim == o.mnDim && mxDim == o.mxDim;
        }
    }

    // ^^^^^^^^^
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            // vvvvvvvvvv
            Tile t[] = new Tile [6];
            for (int i = 0; i < 6; i++) {
                int a1 = in.nextInt();
                int a2 = in.nextInt();
                t[i] = new Tile(a1, a2);
            }
            Arrays.sort(t);
            boolean ans = true;
            ans &= t[0].equals(t[1]);
            ans &= t[2].equals(t[3]);
            ans &= t[4].equals(t[5]);
            ans &= t[0].mnDim == t[2].mnDim;
            ans &= t[3].mxDim == t[5].mxDim;
            ans &= t[1].mxDim == t[4].mnDim;
            out.println(ans ? "POSSIBLE" : "IMPOSSIBLE");
            // ^^^^^^^^^^
        } finally {
            out.close();
        }
    }
}
