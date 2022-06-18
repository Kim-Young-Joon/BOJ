package implementation;

import java.util.Scanner;

// N 찍기
public class Sol_2741 {
    static int N;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }

    static void output() {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        input();
        output();
    }
}
