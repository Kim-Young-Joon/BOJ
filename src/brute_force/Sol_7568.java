package brute_force;

import java.io.*;
import java.util.StringTokenizer;

// 덩치
public class Sol_7568 {
    static int size;
    static int[][] list;
    static int[] rank;

    static void input() {
        FastReader scan = new FastReader();
        size = scan.nextInt();
        rank = new int[size];
        for(int i = 0; i < size; i++) {
            rank[i] = 1;
        }

        list = new int[size][2];
        for(int i = 0; i < size; i++) {
            list[i][0] = scan.nextInt();
            list[i][1] = scan.nextInt();
        }
    }

    static void rec_func(int k) {
        if(k == size) { // 모든 인원의 순위를 다 결정한 경우
            return;
        } else { // 아직 순위가 결정되지 않은 인원이 있는 경우
            for(int i = 0; i < size; i++) {
                if(list[k][0] < list[i][0] && list[k][1] < list[i][1]) {
                    rank[k]++;
                }
            }
            rec_func(k + 1);
        }
    }

    public static void main(String[] args) {
        input();
        rec_func(0);
        for(int i = 0; i < size; i++) {
            System.out.print(rank[i] + " ");
        }
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
