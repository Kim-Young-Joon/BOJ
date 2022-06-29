package string_problem;

import java.util.Arrays;
import java.util.Scanner;

// 소트인사이드
public class Sol_1427 {
    static char[] c;

    static void input() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        c = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }
    }

    static void solution() {
        Arrays.sort(c);
        for(int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
