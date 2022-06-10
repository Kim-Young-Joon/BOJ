package brute_force;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 약수 구하기
public class Sol_2501 {
    static int N, K;

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        K = scan.nextInt();
    }

    static int solution() {
        int num = 0;
        ArrayList<Integer> divisor = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                divisor.add(i);
            }
        }

        if(divisor.size() < K) {
            num = 0;
        } else {
            num = divisor.get(K-1);
        }

        return num;
    }

    public static void main(String[] args) {
        input();
        System.out.println(solution());
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
