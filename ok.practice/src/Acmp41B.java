// acmp.ru
import java.io.*;
import java.util.*;
public class Acmp41B {

    // Functions if Needed
    // vvvvvvvvv
    static class MyReadInt {
        InputStream in;
        byte buf[];
        char token[];
        final static int BUF_SZ = 32 * 1024 * 1024;
        int bufSz;
        int ofs;
        MyReadInt(InputStream ain) throws IOException {
            in = ain;
            buf = new byte [BUF_SZ];
            token = new char[32];
            readNext();
        }
        boolean readNext() throws IOException {
            ofs = 0;
            bufSz = in.read(buf);
            return bufSz > 0;
        }
        int parseInt(char token[], int len) {
            int sign = 1;
            int pos = 0;
            if (token[pos] == '-') {
                sign = -1;
                pos++;
            } else if (token[pos] == '+') {
                sign = 1;
                pos++;
            }
            int n = 0;
            while (pos < len) {
                n *= 10;
                n += token[pos] - '0';
                pos++;
            }
            return n * sign;
        }
        public int nextInt() throws IOException {
            int pos = 0;
            do {
                while (ofs < bufSz) {
                    if (buf[ofs] >= '0' && buf[ofs] <= '9' || buf[ofs] == '+' || buf[ofs] == '-') {
                        break;
                    } else {
                        ofs++;
                    }
                }
                while (ofs < bufSz) {
                    if (buf[ofs] >= '0' && buf[ofs] <= '9' || buf[ofs] == '+' || buf[ofs] == '-') {
                        token[pos++] = (char)buf[ofs];
                        ofs++;
                    } else {
                        ofs++;
                        return parseInt(token, pos);
                    }
                }
            } while (readNext());
            return parseInt(token, pos);
        }
    }
    // ^^^^^^^^^

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        try {
            // your solution
            MyReadInt in = new MyReadInt(System.in);
            // vvvvvvvvvv
            int n = in.nextInt();
            int count[] = new int [201];
            for (int i = 0; i < n; i++) {
                int v = in.nextInt();
                count[v + 100]++;
            }
            boolean first = true;
            for (int v = -100; v <= 100; v++) {
                for (int i = 0; i < count[v + 100]; i++) {
                    if (first) {
                        first = false;
                    } else {
                        out.print(" ");
                    }
                    out.print(v);
                }
            }
            // ^^^^^^^^^^
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    }
}
