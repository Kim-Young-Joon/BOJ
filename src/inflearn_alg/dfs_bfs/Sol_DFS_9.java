package inflearn_alg.dfs_bfs;

// 조합 구하기

import java.util.Scanner;

public class Sol_DFS_9 {
    static int[] combi;
    static int n, m;
    public static void DFS(int L, int s) {
        if (L == m) {
            for (int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        DFS(0, 1);
    }
}
