package string_problem;

import java.util.Scanner;

// 뒤집힌 덧셈
public class Sol_1357 {
    static String X, Y;

    static void input() {
        Scanner sc = new Scanner(System.in);
        X = sc.next();
        Y = sc.next();
    }

    static void solution() {
        int x = rev(X);
        int y = rev(Y);

        System.out.println(rev(String.valueOf(x+y)));
    }

    static int rev(String num) {
        int index = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = num.length()-1; i >= 0; i--) {
            char c = num.charAt(i);
            if(c == '0' && index == 0) {
                continue;
            }
            sb.append(c - 48);
            index++;
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
