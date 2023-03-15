package inflearn_alg.dfs_bfs;

// 수열 추측하기

import java.util.Scanner;

public class Sol_DFS_8 {
    static int[] b, p, ch; // b : combination 값 저장, p : 순열 저장, ch : 중복 순열이 아니기 때문에 체크 배열 필요
    static int n, f; // n : 입력으로 들어오는 순열 개수, f : 입력으로 들어오는 final number
    boolean flag = false; // flag : 원하는 값 구하면 재귀함수가 멈출 수 있도록 하기 위함
    int[][] dy = new int[35][35]; // 메모이제이션을 위한 이차원 배열 (최대값 만큼으로 미리 설정)

    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];

        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    public void DFS(int L, int sum) {
        if(flag) return; // 이미 결과를 구한 경우 더이상 재귀가 돌지 않도록 하기 위함

        if (L == n) {
            if (sum == f) { // 구하고자 하는 final number 와 동일한지 확인
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) { // i 값 자체가 순열의 숫자를 의미
                if (ch[i] == 0) {
                    ch[i] = 1; // 사용했다는 표시
                    p[L] = i; // 순열에 해당 숫자를 표기
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sol_DFS_8 T = new Sol_DFS_8();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1]; // 1 ~ n 까지의 수를 이용해야 하기 때문에 n + 1 만큼 잡아줌
        for (int i = 0; i < n; i++) b[i] = T.combi(n - 1, i);
        T.DFS(0, 0);
    }
}
