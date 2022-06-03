package brute_force;

import java.io.*;
import java.util.StringTokenizer;

// 날짜 계산
public class Sol_1476 {
    static int E, S, M;

    static void input() {
        FastReader scan = new FastReader();
        E = scan.nextInt();
        S = scan.nextInt();
        M = scan.nextInt();
    }

    static int calculator() {
        int year = 1;
        int a = 1, b = 1, c = 1;

        while(true) {
            if(a == E && b == S && c == M) {
                break;
            } else {
                if(a == 15) {
                    a = 1;
                } else if(a < 15) {
                    a++;
                }

                if(b == 28) {
                    b = 1;
                } else if(b < 28) {
                    b++;
                }

                if(c == 19) {
                    c = 1;
                } else if(c < 19) {
                    c++;
                }
                year++;
            }
        }

        return year;
    }

    public static void main(String[] args) {
        input();
        System.out.println(calculator());
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
