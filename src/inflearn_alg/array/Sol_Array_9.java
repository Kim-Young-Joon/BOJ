package inflearn_alg.array;

import java.util.Scanner;

// 격자판 최대합
public class Sol_Array_9 {
    static int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2; // 행의 합, 열의 합
        for(int i = 0; i < n; i++) { // 행과 열의 합 중 가장 큰 값이 answer 로 들어간다
            sum1 = sum2 = 0;
            for(int j = 0; j < n; j++) {
                sum1 += arr[i][j]; // 행의 합
                sum2 += arr[j][i]; // 열의 합
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for(int i = 0; i < n; i++) {
            sum1 += arr[i][i]; // 왼쪽 위 -> 오른쪽 아래 대각선
            sum2 += arr[i][n - i - 1]; // 오른쪽 위 -> 왼쪽 아래 대각선
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
