package string_problem;

import java.util.Scanner;

// IOIOI
public class Sol_5525 {
    static String standard;
    static char[] data;

    static void input() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = sc.nextInt();
        data = new char[len];
        String str = sc.next();

        for(int i = 0; i < len; i++) {
            data[i] = str.charAt(i);
        }

        // P_N 만들기
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append("IO");
        }
        sb.append("I");
        standard = sb.toString();
    }

    static int solution() {
        int cnt = 0;

        for(int i = 0; i < data.length - standard.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < i + standard.length(); j++) {
                sb.append(data[j]);
            }
            if(standard.equals(sb.toString())) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        input();
        System.out.println(solution());
    }
}
