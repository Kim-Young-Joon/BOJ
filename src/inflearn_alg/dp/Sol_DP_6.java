package inflearn_alg.dp;

// 최대점수 구하기 (냅색 알고리즘)
// 문제는 한 번 풀면 중복해서 풀 수 없으므로 역순으로 처리한다.

import java.util.Scanner;

public class Sol_DP_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dy = new int[m + 1];

        for (int i = 0; i < n; i++) {
            int ps = sc.nextInt(); // 문제 풀면 획득하는 점수
            int pt = sc.nextInt(); // 문제 푸는데 걸리는 시간

            for (int j = m; j >= pt; j--) dy[j] = Math.max(dy[j], dy[j - pt] + ps);
        }

        System.out.println(dy[m]);
    }
}
