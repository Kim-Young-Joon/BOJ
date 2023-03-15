package inflearn_alg.dfs_bfs;

// 바둑이 승차

import java.util.Scanner;

public class Sol_DFS_2 {
    static int total = Integer.MIN_VALUE;
    static int condition;
    static int[] weight;

    static void DFS(int idx, int sum) {
        if(sum > condition) return;
        if (idx == weight.length) {
            total = Math.max(total, sum);
        } else {
            DFS(idx + 1, sum + weight[idx]);
            DFS(idx + 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        condition = sc.nextInt();

        int n = sc.nextInt();
        weight = new int[n];

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }

        DFS(0, 0);
        System.out.println(total);
    }
}
