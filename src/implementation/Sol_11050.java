package implementation;

import java.util.Scanner;

// 이항 계수 1
public class Sol_11050 {
    static int N, K;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
    }

    static void solution() {
        int ans = factorial(N) / (factorial(K) * factorial(N - K));
        System.out.println(ans);
    }

    static int factorial(int num) {
        int total = 1;

        for(int i = 1; i <= num; i++) {
            total *= i;
        }

        return total;
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
