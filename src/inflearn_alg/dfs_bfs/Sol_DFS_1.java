package inflearn_alg.dfs_bfs;

// 합이 같은 부분 집합

import java.util.Scanner;

public class Sol_DFS_1 {
    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false; // 조건에 부합하는 케이스 발견시 빠르게 종료하기 위함

    public static void DFS(int level, int sum, int[] arr) {
        if(flag) return;
        if(sum > total / 2) return;
        if (level == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(level + 1, sum + arr[level], arr);
            DFS(level + 1, sum, arr);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
