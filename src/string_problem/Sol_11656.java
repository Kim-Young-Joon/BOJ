package string_problem;

import java.util.Arrays;
import java.util.Scanner;

// 접미사 배열
public class Sol_11656 {
    static String S;

    static void input() {
        Scanner sc = new Scanner(System.in);
        S = sc.next();
    }

    static void solution() {
        String[] suffix = new String[S.length()];
        for(int i = 0; i < S.length(); i++) {
            suffix[i] = S.substring(i);
        }
        Arrays.sort(suffix);

        for(String str : suffix)
            System.out.println(str);
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
