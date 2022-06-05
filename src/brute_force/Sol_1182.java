package brute_force;

import java.io.*;
import java.util.StringTokenizer;

// 부분 수열의 합
public class Sol_1182 {
    static int N, S, ans;
    static int[] numbers;

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        S = scan.nextInt();

        numbers = new int[N+1];
        for(int i = 1; i < N + 1; i++) {
            numbers[i] = scan.nextInt();
        }
    }

    static void rec_func(int k, int value) {
        if (k == N + 1) {  // 부분 수열을 하나 완성 시킨 상태
            // value 가 S 랑 같은 지 확인하기
            if (value == S) ans++;
        } else {
            // k 번째 원소를 포함시킬 지 결정하고 재귀호출해주기
            // Include
            rec_func(k + 1, value + numbers[k]);
            // Not Include
            rec_func(k + 1, value);
        }
    }

    public static void main(String[] args) {
        input();
        rec_func(1, 0);
        // ans 가 정말 "진 부분집합"만 다루는 지 확인하기
        if (S == 0){
            ans--;
        }
        System.out.println(ans);
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
