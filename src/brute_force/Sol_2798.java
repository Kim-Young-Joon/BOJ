package brute_force;

import java.io.*;
import java.util.StringTokenizer;

// 블랙잭
public class Sol_2798 {
    static int num, target; // 카드 숫자를 저장할 변수, 목표값
    static int[] numbers; // 숫자 목록을 저장할 배열

    static void input() {
        FastReader scan = new FastReader();
        num = scan.nextInt();
        target = scan.nextInt();

        numbers = new int[num];
        for(int i = 0; i < num; i++) {
            numbers[i] = scan.nextInt();
        }
    }

    static int solution() {
        int sum = 0;
        for(int i1 = 0; i1 < num - 2; i1++) {
            for(int i2 = i1 + 1; i2 < num - 1; i2++) {
                for(int i3 = i2 + 1; i3 < num; i3++) {
                    int temp = numbers[i1] + numbers[i2] + numbers[i3];
                    if (temp == target) {
                        return temp;
                    }

                    if(sum < temp && temp < target) {
                        sum = temp;
                    }
                }
            }
        }
        return sum;
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
