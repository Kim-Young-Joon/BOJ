package sorting;

import java.util.Arrays;
import java.util.Scanner;

// 점수 집계
public class Sol_9076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] num = new int[T][5];
        int minus = 0;

        for (int i = 0; i < T; i++) {
            for (int j =0; j < 5; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < num.length; i++) {
            Arrays.sort(num[i]);
        }

        for (int i =0; i < T; i++) {
            minus = num[i][3] - num[i][1];
            if (minus >= 4) {
                System.out.println("KIN");
            } else {
                System.out.println(num[i][1]+num[i][2]+num[i][3]);
            }
        }
    }
}
