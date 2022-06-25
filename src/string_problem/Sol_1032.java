package string_problem;

import java.util.Scanner;

// 명령 프롬프트
public class Sol_1032 {
    static StringBuilder[] sb;

    static void input() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sb = new StringBuilder[N];

        for(int i = 0; i < N; i++) {
            sb[i] = new StringBuilder(sc.next());
        }
    }

    static void solution() {
        StringBuilder str = new StringBuilder(sb[0]);

        for(int i = 0; i < sb.length; i++) {
            for(int j = 0; j < sb[i].length(); j++) {
                if(str.charAt(j) != sb[i].charAt(j)) {
                    str.deleteCharAt(j);
                    str.insert(j, "?");
                }
            }
        }

        System.out.println(str);
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
