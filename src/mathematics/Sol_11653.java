package mathematics;

import java.util.Scanner;

// 소인수분해
public class Sol_11653 {
    static int N;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }

    static void solution() {
        int num = N;
        int factor = 2;

        while(num != 1) {
            if(num % factor == 0) {
                System.out.println(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
