package inflearn_alg.dfs_bfs;

// 순열 구하기

import java.util.Scanner;

public class Sol_DFS_6 {
    static int[] pm, ch, arr;
    static int n, m;

    public static void DFS(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) { // 중복 순열이 아니므로 사용한 것에 대한 체크가 필요
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        ch = new int[n];
        pm = new int[m];
        DFS(0);
    }
}
