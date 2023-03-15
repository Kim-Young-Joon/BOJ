package inflearn_alg.dfs_bfs;

// 최대 점수 구하기

import java.util.Scanner;

public class Sol_DFS_3 {
    static int max = Integer.MIN_VALUE;
    static int[] score;
    static int[] times;
    static int timeout;

    static void DFS(int level, int sum, int time) {
        if (time > timeout) return;
        if (level == score.length) {
            max = Math.max(max, sum);
        } else {
            DFS(level +1, sum + score[level], time + times[level]);
            DFS(level +1, sum, time);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        timeout = sc.nextInt();

        score = new int[n];
        times = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            times[i] = sc.nextInt();
        }

        DFS(0, 0, 0);
        System.out.println(max);
    }
}
