package implementation;

import java.util.Scanner;

// 숫자의 개수
public class Sol_2577 {
    static int A, B, C, mulNum;


    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        mulNum = A * B * C;
    }

    static void solution() {
        int[] counts = new int[10];
        String input = String.valueOf(A * B * C);

        for (int i = 0; i < input.length(); ++i) {
            counts[input.charAt(i) - '0']++;
        }

        for (int i = 0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }

    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
