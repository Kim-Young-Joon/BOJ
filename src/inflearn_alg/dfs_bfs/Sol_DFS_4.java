package inflearn_alg.dfs_bfs;

// 중복 순열 구하기

import java.util.Scanner;

public class Sol_DFS_4 {
    static int[] pm;
    static int n, m;

    public static void DFS(int level) {
        if (level == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[level] = i;
                DFS(level + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        DFS(0);
    }
}
