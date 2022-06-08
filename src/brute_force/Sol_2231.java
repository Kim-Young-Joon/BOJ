package brute_force;

import java.io.*;
import java.util.StringTokenizer;

// 분해합
public class Sol_2231 {
    static int num, len;

    static void input() {
        FastReader scan = new FastReader();
        String str = scan.next();
        num = Integer.parseInt(str); // 자연수 입력값
        len = str.length(); // 해당 수의 길이(자리수)
    }

    static int solution() {
        int result = 0;
        for(int i = (num - (len * 9)); i < num; i++) {
            int number = i;
            int sum = 0; // 각 자릿수 합 변수

            while(number != 0) {
                sum += number % 10;	// 각 자릿수 더하기
                number /= 10;
            }

            // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
            if(sum + i == num) {
                result = i;
                break;
            }

        }
        return result;
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
