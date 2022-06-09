package sorting;

import java.io.*;
import java.util.*;

// 수 정렬하기 2
public class Sol_2751 {
    static int N;
    static ArrayList<Integer> list;

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(scan.nextInt());
        }
        Collections.sort(list);
    }

    static void output() {
        StringBuilder sb = new StringBuilder();

        for(int val : list) {
            sb.append(val).append('\n');
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        input();
        output();
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
