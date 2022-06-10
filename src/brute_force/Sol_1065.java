package brute_force;

import java.io.*;
import java.util.StringTokenizer;

// 한수
public class Sol_1065 {
    static int N;

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
    }

    static int solution() {
        int cnt = 0;
        for(int number = 1; number <= N; number++) {
            if(isHan(number)) {
                cnt++;
            }
        }

        return cnt;
    }

    static boolean isHan(int k) {
        int[] digits; // 각 자리수를 저장할 배열
        int sequence; // 자리수의 차이를 계산

        if(k < 100) {
            return true; // 한자리와 두자리 수는 항상 참이다.
        } else if(k < 1000) { // 세자리 수는 배열을 통해 각 자리수 값을 저장
            digits = new int[3];
            digits[0] = k / 100;
            digits[1] = (k - (digits[0] * 100)) / 10;
            digits[2] = k % 10;
        } else {
            return false;
        }

        // 세자리수에 대한 계산이 필요하다.
        sequence = digits[1] - digits[0];
        if(sequence == (digits[2] - digits[1])) {
            return true;
        } else {
            return false;
        }
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
